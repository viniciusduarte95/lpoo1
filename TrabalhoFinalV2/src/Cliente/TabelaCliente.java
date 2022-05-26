package Cliente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelaCliente extends AbstractTableModel{
    private String[] colunas = new String[]{"Nome", "Sobrenome", "Telefone"};
    private List<Cliente> lista = new ArrayList();

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    /*@Override
    public boolean isCellEditable(int row, int column) {
        return false;
        //if(column==0)
        //    return false;
        //return true;
    }*/

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente customer = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return customer.getNome();
            case 1: return customer.getSobrenome();
            case 2: return customer.getTelefone();
            default : return null;
        }
    }

    public void adicionaCliente(Cliente customer) {
        this.lista.add(customer);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
        System.out.println(this.lista.size());
    }
    
    public boolean removeCliente(Cliente customer) {
        int linha = this.lista.indexOf(customer);
        boolean result = this.lista.remove(customer);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void atualizarTabela(List<Cliente> lista){
        this.lista = new ArrayList();
        this.lista.addAll(lista);
        this.fireTableDataChanged();
    }

    public Cliente getCliente(int linha){
        return lista.get(linha);
    }
}
