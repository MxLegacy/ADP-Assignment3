/* NonAcademicStaffFactory.java
   Factory for Non Academic Staff
   Author: Tatum De Wet (218069227)
   Date: 11 June 2021
 */
package za.ac.cput.factory;

import za.ac.cput.Entity.NonAcademicStaff;
import za.ac.cput.Util.GenericHelper;

public class NonAcademicStaffFactory{
    String NASid = GenericHelper.generateID();

    public static NonAcademicStaff createNonAcademicStaff(String NASname, String NASposition, String NASdepartment, String NASid){

        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff.NASBuilder()
                .setNASname(NASname).setNASposition(NASposition).setNASdepartment(NASdepartment).setNASid(NASid).build();
        return nonAcademicStaff;
    }
}
