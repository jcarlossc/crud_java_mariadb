package com.jcsc.mavensqljdbc;

import controller.CustomerController;
import java.util.List;
import model.CustomerModel;

/**
 *
 * @author Carlos da Costa
 */
public class MavenSqlJdbc {

    public static void main(String[] args) throws ClassNotFoundException {
        
        CustomerController customerController = new CustomerController();
  
        // Insere dados no banco de dados
        //CustomerModel customerModel = new CustomerModel();
        //customerModel.setName("Ewellyn Ribeiro");
        //customerModel.setPhone("81999998888");
        //customerController.save(customerModel);

        // Atualiza os dados do banco de dados
        //CustomerModel customerModel = new CustomerModel();
        //customerModel.setId(26);
        //customerModel.setName("Teresa Ribeiro");
        //customerModel.setPhone("81895624587");
        //customerController.update(customerModel);
        

        // Lista os clientess do banco de dados
        //List<CustomerModel> customers = customerController.getAll(); 
        //for(int i = 0; i < customers.size(); i++){
        //    System.out.println(customers.get(i));
        //    System.out.println("");
        //}

        // Apaga dados do banco de dados
        //customerController.delete(6);
        
        // Lista a quantidade de clientes
        List<CustomerModel> customers = customerController.getAll();
        System.out.println("Total de clientes = " + customers.size());
        
    }
}
