/*      AcademicStaffFactory.java

        Author: Tawfeeq Cupido (216266882)
        Date: 11 June 2021

 */
package za.ac.cput.factory;

import za.ac.cput.Entity.AcademicStaff;


public class AcademicStaffFactory{
    public static AcademicStaff ASBuilder(
            String ASname,
            String ASposition,
            String ASdepartment,
            String AScourse
    )
    {
        return new AcademicStaff.ASBuilder()
                .setASname(ASname)
                .setASposition(ASposition)
                .setASdepartment(ASdepartment)
                .setAScourse(AScourse)

                .build();
    }
}