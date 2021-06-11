/* NonAcademicStaff.java
   Entity for Non Academic Staff
   Author: Tatum De Wet (218069227)
   Date: 9 June 2021
 */
package za.ac.cput.Entity;

public class NonAcademicStaff{
    private String NASname, NASposition, NASdepartment;

    private NonAcademicStaff(NASBuilder builder) {
        this.NASname = builder.NASname;
        this.NASposition = builder.NASposition;
        this.NASdepartment = builder.NASdepartment;
    }

    @Override
    public String toString() {
        return "NonAcademicStaff: " +
                "Name='" + NASname + '\'' +
                ", Position='" + NASposition + '\'' +
                ", Department='" + NASdepartment + '\'' +
                '}';
    }

    public static class NASBuilder{
        private String NASname, NASposition, NASdepartment;

        public NASBuilder setNASname(String NASname) {
            this.NASname = NASname;
            return this;
        }

        public NASBuilder setNASposition(String NASposition) {
            this.NASposition = NASposition;
            return this;
        }

        public NASBuilder setNASdepartment(String NASdepartment) {
            this.NASdepartment = NASdepartment;
            return this;
        }

        //return constructed object
        public NonAcademicStaff build(){
            return new NonAcademicStaff(this);
        }

        public NASBuilder copy(NonAcademicStaff nonAcademicStaff){
            this.NASname = nonAcademicStaff.NASname;
            this.NASposition = nonAcademicStaff.NASposition;
            this.NASdepartment = nonAcademicStaff.NASdepartment;;
            return this;
        }
    }
}
