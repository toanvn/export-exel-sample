package clc.tool.main;

import clc.tool.domain.Booking;
import clc.tool.domain.Employee;
import org.apache.log4j.Logger;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by qup on 11/17/16.
 */
public class ExportXls {
    static Logger logger = Logger.getLogger(ExportXls.class);

    public static void main(String[] args) {
        logger.info("Running Object Collection demo ");
        System.out.println("Running Object Collection demo " + new Date().toString());
        List<Booking> employees = generateSampleBookingData();
        //List<Employee> employees = generateSampleEmployeeData();
        try{
            InputStream is = ExportXls.class.getResourceAsStream("/templates/employee_template.xlsx");
            try  {
                OutputStream os = new FileOutputStream("target/object_collection_output.xlsx");
                Context context = new Context();
                context.putVar("employees", employees);
                JxlsHelper.getInstance().processTemplate(is, os, context);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.print("Export data done " + new Date().toString());
    }

    static List<Employee> generateSampleEmployeeData(){
        System.out.println("Create data" + new Date().toString());
        Employee employee = new Employee("Ola ama ka ka bla bla", new Date(), new BigDecimal(52.8361), new BigDecimal(52.8361));
        List<Employee> employees = new ArrayList();
        for(int i = 0; i< 10000; i++){
            employees.add(employee);
        }
        System.out.println("Create data done " + new Date().toString());
        return employees;
    }


    public static List<Booking> generateSampleBookingData(){
        System.out.println("Create data" + new Date().toString());
        Booking employee = new Booking("Ola ama ka ka bla bla", new Date(), new BigDecimal(52.8361), new BigDecimal(52.8361));
        List<Booking> employees = new ArrayList();
        for(int i = 0; i< 300000; i++){
            employees.add(employee);
        }
        System.out.println("Create data done " + new Date().toString());
        return employees;
    }
}
