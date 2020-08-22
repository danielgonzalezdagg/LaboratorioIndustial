/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Production.facade;

import Design.Design;
import Design.DesignData;
import Production.ExtraCost;
import Production.Product;
import Production.NecessarySupply;
import Production.Production;
import Production.Stage;
import Production.Step;
import Production.exceptions.MandatoryAttributeProductionException;
import User.exception.UserException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import javax.ejb.Local;

/**
 *
 * @author daniel
 */
@Local
public interface ProductionFacadeLocal {

    
    /**
     * Para editar una paso
     * 
     * @param oldStep
     * @return
     * @throws UserException 
     */
    public Step edit(Step oldStep) throws UserException;
    //ok

    
    /**
     * Para remover un paso
     * 
     * @param step
     * @throws UserException 
     */
    public void remove(Step step) throws UserException;
    //ok
   
    public Step createStep(Step step) throws UserException;
    //ok
    
    public Production createProduction(Production production) throws MandatoryAttributeProductionException;
    //ok
    
    public Production editProduction(Production production) throws MandatoryAttributeProductionException;
    //ok
    
    public List<Product> getProduct();
    //ok
    
    public List<Production> AllProductions();
    //ok.
    
    public Optional<Production> getProductionById(Integer id);
    //ok.
    
    public void createDesign(Design design, DesignData designData, List<NecessarySupply> necessarySupplys);

    /**
     * Realiza una busqueda basado unicamente en el codigo del diseño
     *
     * @param idDesign
     * @return
     */
    public Optional<Design> findDesignByID(Integer idDesign);
    //Not FOund

    public List<Design> AllDesigns();
    //ok.

    public Optional<Product> getProductById(Integer id);
    //ok
    
    public Design editDesign(Design design) throws MandatoryAttributeProductionException;
    //ok.
    
    /**
     * To get all results just set all with null
     *
     * startDate and endDate use to filter the startDate attribute of Production
     *
     * editable, return just the productions available to edit
     *
     * @param idProduction
     * @param name
     * @param startDate
     * @param endDate
     * @param editable
     * @return
     */
    public List<Production> findProduction(Integer idProduction, String name, LocalDate startDate, LocalDate endDate, boolean editable);
    //ok.
    
    /**
     * Can update Name, Quantity, the Design and Group
     *
     * @param production
     * @return
     * @throws UserException
     */
    public Production updateProduction(Production production) throws UserException;
    //ok
    
    public Production updateCommentayOfSteps(Production production);
    //ok
    
    /**
     * Update and add al steps added to the production
     *
     * @param production
     */
//    public void updateSteps(Production production);
    public void updateExtraCost(List<ExtraCost> listExtraCost, Production production) throws MandatoryAttributeProductionException;
    //ok
    
    public void addPostDedign(Design postDesign, Production production) throws MandatoryAttributeProductionException;
    //ok
    
    public double initCost(Production production);
    //ok
    
    public double finalCost(Production production);
    //ok
    
    public double totalExtraCost(Production production);
    //ok
    
    public Optional<Step> findByIdStep(Integer stepId) ;
    //ok
    public Optional<Stage> findByIdStage(Integer stageId);
    //ok
}
