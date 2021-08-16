/* NonAcademicStaff.java
   Entity for Non Academic Staff
   Author: Tatum De Wet (218069227)
   Date: 9 June 2021
 */
package za.ac.cput.Entity;

public class NonAcademicStaff{
    private String NASname, NASposition, NASdepartment, NASid;

    private NonAcademicStaff(NASBuilder builder) {
        this.NASname = builder.NASname;
        this.NASposition = builder.NASposition;
        this.NASdepartment = builder.NASdepartment;
        this.NASid = builder.NASid;

    }

    public void print(){
        System.out.println("Student Number: " + NASname);
        System.out.println("Student Name: " + NASposition);
        System.out.println("Course: " + NASdepartment);
        System.out.println("ID: " + NASid);

    }

    @Override
    public String toString() {
        return "NonAcademicStaff: " +
                "Name='" + NASname + '\'' +
                ", Position='" + NASposition + '\'' +
                ", Department='" + NASdepartment + '\'' +
                ", ID='" + NASid + '\'' +
                '}';
    }

    public String getNASname() {
        return NASname;
    }

    public String getNASposition() {
        return NASposition;
    }

    public String getNASdepartment() {
        return NASdepartment;
    }

    public String getNASid() {
        return NASid;
    }

    public static class NASBuilder{
        private String NASname, NASposition, NASdepartment, NASid;

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

        public NASBuilder setNASid(String NASid) {
            this.NASid = NASid;
            return this;
        }

        //return constructed object
        public NonAcademicStaff build(){
            return new NonAcademicStaff(this);
        }

        public NASBuilder copy(NonAcademicStaff nonAcademicStaff){
            this.NASname = nonAcademicStaff.NASname;
            this.NASposition = nonAcademicStaff.NASposition;
            this.NASdepartment = nonAcademicStaff.NASdepartment;
            this.NASid = nonAcademicStaff.NASid;
            return this;
        }
    }
}
