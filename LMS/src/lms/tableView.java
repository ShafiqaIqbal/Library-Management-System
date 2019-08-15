package lms;


import java.util.*;

import javax.swing.table.AbstractTableModel;


public class tableView extends AbstractTableModel {

    private final String[] columnNames = {"Title", "Author Name", "Edition", "Publisher" ,"Publish Date"};
    private final ArrayList<Book> bookList;

    public tableView(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public int getRowCount() {
        return bookList.size();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book b = bookList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return b.Title;
            case 1:
                return b.authorName;
            case 2:
                return b.edition;
            case 3:
                return b.publisher;
            case 4:
                return b.publishDate;
        }
        return "";
    }

}
