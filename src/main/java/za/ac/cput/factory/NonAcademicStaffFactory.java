/* NonAcademicStaffFactory.java
   Factory for Non Academic Staff
   Author: Tatum De Wet (218069227)
   Date: 11 June 2021
 */
package za.ac.cput.factory;

import za.ac.cput.Entity.NonAcademicStaff;

public class NonAcademicStaffFactory{
    public static NonAcademicStaff createNonAcademicStaff(String NASname, String NASposition, String NASdepartment){

        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff.NASBuilder()
                .setNASname(NASname).setNASposition(NASposition).setNASdepartment(NASdepartment).build();
        return nonAcademicStaff;
    }
}
