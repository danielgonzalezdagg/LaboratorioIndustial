package Modify;

import Supply.Supply;
import User.User;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.7.3.v20180807-rNA", date="2020-08-20T18:29:46")
=======
@Generated(value="EclipseLink-2.7.3.v20180807-rNA", date="2020-08-21T15:48:56")
>>>>>>> dev
@StaticMetamodel(ModifySupply.class)
public class ModifySupply_ { 

    public static volatile SingularAttribute<ModifySupply, String> modifyType;
    public static volatile SingularAttribute<ModifySupply, LocalDate> date;
    public static volatile SingularAttribute<ModifySupply, String> note;
    public static volatile SingularAttribute<ModifySupply, Double> quantity;
    public static volatile SingularAttribute<ModifySupply, Integer> idModifySupply;
    public static volatile SingularAttribute<ModifySupply, User> carnetUser;
    public static volatile SingularAttribute<ModifySupply, Supply> supplyCode;

}