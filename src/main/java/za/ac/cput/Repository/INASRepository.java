/* NonAcademicStaff.java
   Repository for Non Academic Staff
   Author: Tatum De Wet (218069227)
   Date: 25 July 2021
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.NonAcademicStaff;

import java.util.*;

public interface INASRepository extends IRepository<NonAcademicStaff, String>{
    Set<NonAcademicStaff> getAll();
}
