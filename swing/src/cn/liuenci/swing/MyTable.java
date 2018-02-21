package cn.liuenci.swing;

import java.util.Map;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class MyTable extends AbstractTableModel {
	private static final long serialVersionUID = -7495940408592595397L;
	private Vector content = null;
	private String[] title_name = { "�༶", "�γ�", "��ʦ", "�Ƿ����" };

	public MyTable() {
		content = new Vector();
	}

	public MyTable(int count) {
		content = new Vector(count);
	}

	public void addRow(Map map) {
		Vector v = new Vector(4);
		v.add(map.get("classname"));
		v.add(1, map.get("courses"));
		v.add(2, map.get("username"));
		v.add(3, new Boolean(map.get("isvalid").toString()));
		v.add(4, map);
		content.add(v);
	}

	public void removeRow(int row) {
		content.remove(row);
	}

	public void removeRows(int row, int count) {
		((Vector) content.get(row)).remove(count);
		this.fireTableCellUpdated(row, count);
	}

	public void remove() {
		content = new Vector();
	}

	/**
	 * �ñ����ĳЩֵ���޸�,����ҪsetValueAt(Object value, int row, int col)������ϲ���ʹ�޸���Ч
	 */
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 3) {
			return true;
		}
		return false;
	}

	/**
	 * ʹ�޸ĵ�������Ч
	 */
	public void setValueAt(Object value, int row, int col) {
		((Vector) content.get(row)).remove(col);
		((Vector) content.get(row)).add(col, value);
		this.fireTableCellUpdated(row, col);
	}

	public String getColumnName(int col) {
		return title_name[col];
	}

	public int getColumnCount() {
		return title_name.length;
	}

	public int getRowCount() {
		return content.size();
	}

	public Object getValueAt(int row, int col) {
		return ((Vector) content.get(row)).get(col);
	}

	/**
	 * ������������
	 */
	public Class getColumnClass(int col) {
		return getValueAt(0, col).getClass();
	}

	public Vector getContent() {
		return content;
	}

	public Map getMap(int row) {
		Map map = (Map) ((Vector) content.get(row)).get((4));
		map.put("isvalid", getValueAt(row, 3));
		return map;
	}
}