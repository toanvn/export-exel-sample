package clc.tool.main;

import org.jxls.command.CellRefGenerator;
import org.jxls.common.CellRef;
import org.jxls.common.Context;

/**
 * Created by qup on 11/17/16.
 */
public class SimpleCellRefGenerator implements CellRefGenerator {
    public CellRef generateCellRef(int index, Context context) {
        return new CellRef("sheet" + index + "!B2");
    }
}