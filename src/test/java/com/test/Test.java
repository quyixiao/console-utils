package com.test;


import enums.Align;
import table.Cell;
import util.ConsoleTable;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<Cell> header = new ArrayList<Cell>() {{
            add(new Cell("name"));
            add(new Cell("email"));
            add(new Cell("tel"));
        }};
        List<List<Cell>> body = new ArrayList<List<Cell>>() {{
            add(new ArrayList<Cell>() {{
                add(new Cell("kat"));
                add(new Cell(Align.CENTER, "kat@gimal.com"));
                add(new Cell(Align.RIGHT, "54321"));
            }});
            add(new ArrayList<Cell>() {{
                add(new Cell("ashe"));
                add(new Cell("ashe_111@hotmail.com"));
                add(new Cell("9876543210"));
            }});
            add(new ArrayList<Cell>() {{
                add(null);
                add(new Cell(null));
                add(new Cell(Align.LEFT, "11"));
            }});
        }};
        //default
        String a = new ConsoleTable.ConsoleTableBuilder().addHeaders(header).addRows(body).build().toString();
        System.out.println(a);
    }
}
