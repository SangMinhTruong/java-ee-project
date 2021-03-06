/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsstore.bo;

import java.util.ArrayList;
import java.util.List;
import sportsstore.dao.ProductDAO;
import sportsstore.dto.ProductDTO;

/**
 *
 * @author Max
 */
public class ProductBO {
    
    public List<ProductDTO> getAllProducts() throws Exception {
        ProductDAO productDAO = null;
        try {
            productDAO = new ProductDAO();
            return productDAO.getAll();
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            productDAO.closeConnection();
        }
    }
    
    public ProductDTO getProductById(Integer id) throws Exception {
        ProductDAO productDAO = null;
        try {
            productDAO = new ProductDAO();
            return productDAO.get(id);
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            productDAO.closeConnection();
        }
    }
    
    public boolean createProduct(ProductDTO newProduct) throws Exception {
        ProductDAO productDAO = null;
        try {
            productDAO = new ProductDAO();
            return productDAO.create(newProduct);
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            productDAO.closeConnection();
        }
    }
    
    public boolean editProduct(ProductDTO product) throws Exception {
        ProductDAO productDAO = null;
        try {
            productDAO = new ProductDAO();
            return productDAO.edit(product);
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            productDAO.closeConnection();
        }
    }
    
    public boolean removeProduct(Integer id) throws Exception {
        ProductDAO productDAO = null;
        try {
            productDAO = new ProductDAO();
            return productDAO.remove(id);
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            productDAO.closeConnection();
        }
    }
}
