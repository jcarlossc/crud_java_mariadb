package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CustomerModel;
import util.ConnectionFactory;

/**
 *
 * @author Carlos da Costa
 */
public class CustomerController {
    
    public void save(CustomerModel customer) throws ClassNotFoundException {
        // Variável que recebe como valor uma instrução sql INSERT
        String sql = "INSERT INTO customer(name, phone) VALUES(?, ?)";
        // Declaração da variável connection
        Connection connection = null;
        // Declaração da variável statement
        PreparedStatement statement = null;
        
        try {
            // Cria uma conexão com o banco
            connection = ConnectionFactory.getConnection();
            // Cria um PreparedStatment, classe usada para executar a query
            statement = connection.prepareStatement(sql);
            // Define os valores do parâmetro, tipo e posição
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getPhone());
            // Executa a sql para inserção dos dados
            statement.execute();
            System.out.println("Cliente Cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            // Exceção que será lançada caso algo de errado aconteça
            throw new RuntimeException("Erro ao inserir dados no banco de dados. ", ex);
        } finally {
            // Fecha a connection e o statement
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void update(CustomerModel customer) throws ClassNotFoundException {
        // Variável que recebe como valor uma instrução sql UPDATE
        String sql = "UPDATE customer SET name = ?, phone = ? WHERE id = ?";
        // Declaração da variável connection
        Connection connection = null;
        // Declaração da variável statement
        PreparedStatement statement = null;
        
        try {
            // Cria uma conexão com o banco
            connection = ConnectionFactory.getConnection();
            // Cria um PreparedStatment, classe usada para executar a query
            statement = connection.prepareStatement(sql);
            // Define os valores do parâmetro, tipo e posição
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getPhone());
            statement.setInt(3, customer.getId());
            // Executa a sql para atualizar os dados
            statement.execute();
            System.out.println("Cliente atualizado com sucesso!");
            
        } catch (SQLException ex) {
            // Exceção que será lançada caso algo de errado aconteça
            throw new RuntimeException("Erro ao atualizar o banco de dados. ", ex);
        } finally {
            // Fecha a connection e o statement
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public List<CustomerModel> getAll() throws ClassNotFoundException {
        // Variável que recebe como valor uma instrução sql SELECT
        String sql = "SELECT * FROM customer";
        // Declaração da Lista que receberá os dados do SELECT
        List<CustomerModel> list = new ArrayList<>();
        // Declaração da variável connection
        Connection connection = null;
        // Declaração da variável statement
        PreparedStatement statement = null;
        // Declaração da variável resultSet
        ResultSet resultSet = null;
        
        try {
            // Cria uma conexão com o banco
            connection = ConnectionFactory.getConnection();
            // Cria um PreparedStatment, classe usada para executar a query
            statement = connection.prepareStatement(sql);
            // Executa a query
            resultSet = statement.executeQuery();
            // Enquanto existir dados no banco de dados, faça
            while (resultSet.next()) {
                // Instancia um objeto cliente
                CustomerModel customerModel = new CustomerModel();
                // Define os valores do parâmetro, tipo e posição
                customerModel.setId(resultSet.getInt("id"));
                customerModel.setName(resultSet.getString("name"));
                customerModel.setPhone(resultSet.getString("phone"));
                // Adiciona o cliente recuperado á lista
                list.add(customerModel);
            }
        } catch (SQLException ex) {
            // Exceção que será lançada caso algo de errado aconteça
            throw new RuntimeException("Erro ao selecionar dados do banco de dados. ", ex);
        } finally {
            // Fecha a connection, o statement e o resultSet
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        // Retorna a lista com os dados do banco de dados
        return list;
    }
 
    public void delete(int id) throws ClassNotFoundException {
        // Variável que recebe como valor a instrução sql DELETE
        String sql = "DELETE FROM customer WHERE id = ?";
        // Declaração da variável connection
        Connection connection = null;
        // Declaração da variável statement
        PreparedStatement statement = null;
        
        try {
            // Cria uma conexão com o banco
            connection = ConnectionFactory.getConnection();
            //Cria um PreparedStatment, classe usada para executar a query
            statement = connection.prepareStatement(sql);
            // Define o valor do parâmetro, tipo e posição
            statement.setInt(1, id);
            // Executa a sql para deletar os dados
            statement.execute();
            System.out.println("Cliente Excluído com sucesso!");
            
        } catch (SQLException ex) {
            // Exceção que será lançada caso algo de errado aconteça
            throw new RuntimeException("Erro ao apagar dados do banco de dados. ", ex);
        } finally {
            // Fecha a connection e o statement 
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
}
