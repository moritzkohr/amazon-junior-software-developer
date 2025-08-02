class Teacher extends Employee {
    String subject;
    String qualification;

    Teacher(String name, Date dateOfBirth, Date dateOfAppointment, String subject, String qualification) {
        this.name = name;
        this.dob = dateOfBirth;
        this.dateOfAppointment = dateOfAppointment;
        this.subject = subject;
        this.qualification = qualification;
    }


    @Override
    void setSalary(int sal) {
        this.salary = sal;
    }

    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    void getDetails() {
        System.out.println("Name of Teacher: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualification: " + this.qualification);
        System.out.println("Salary: " + this.getSalary());
    }
}
