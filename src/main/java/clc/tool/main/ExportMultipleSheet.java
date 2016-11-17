package clc.tool.main;

import clc.tool.models.Department;
import org.jxls.area.XlsArea;
import org.jxls.command.Command;
import org.jxls.command.EachCommand;
import org.jxls.command.IfCommand;
import org.jxls.common.AreaRef;
import org.jxls.common.CellRef;
import org.jxls.common.Context;
import org.jxls.transform.Transformer;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by qup on 11/17/16.
 */
public class ExportMultipleSheet {

    public static void main(String[] args) {
        for(int i= 0;i<10; i++){
            createXls(i);
        }
    }

    static void createXls(int index){
        List<Department> departments = ExportMultipleSheet.createDepartments();
        System.out.println("Opening input stream");
        try {
            InputStream is = ExportMultipleSheet.class.getResourceAsStream("/templates/multi_sheet_template.xls");
            try  {
                OutputStream os = new FileOutputStream("target/multiple_sheet_"+index+".xls");
                Transformer transformer = org.jxls.util.TransformerFactory.createTransformer(is, os);
                System.out.println("Creating area");
                XlsArea xlsArea = new XlsArea("Template!A1:G15", transformer);
                XlsArea departmentArea = new XlsArea("Template!A2:G12", transformer);
                EachCommand departmentEachCommand = new EachCommand("department", "departments", departmentArea, new SimpleCellRefGenerator());
                XlsArea employeeArea = new XlsArea("Template!A9:F9", transformer);
                XlsArea ifArea = new XlsArea("Template!A18:F18", transformer);
                IfCommand ifCommand = new IfCommand("employee.payment <= 20000",
                        ifArea,
                        new XlsArea("Template!A9:F9", transformer));
                employeeArea.addCommand(new AreaRef("Template!A9:F9"), ifCommand);
                Command employeeEachCommand = new EachCommand("employee", "department.staff", employeeArea);
                departmentArea.addCommand(new AreaRef("Template!A9:F9"), employeeEachCommand);
                xlsArea.addCommand(new AreaRef("Template!A2:F12"), departmentEachCommand);
                Context context = new Context();
                context.putVar("departments", departments);
                System.out.println("Applying at cell Sheet!A1");
                xlsArea.applyAt(new CellRef("Sheet!A1"), context);
                xlsArea.processFormulas();
                System.out.println("Complete");
                transformer.write();
                System.out.println("written to file");
            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static List<Department> createDepartments(){
        System.out.println("Create data" + new Date().toString());
        List<Department> employees = new ArrayList<>();
        for(int i = 0; i< 20; i++){
            Department department = new Department();
            department.setName("Department_"+ i);
            department.setStaff(ExportXls.generateSampleEmployeeData());
            employees.add(department);
        }
        System.out.println("Create data done " + new Date().toString());
        return employees;
    }
}
