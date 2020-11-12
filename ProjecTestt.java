class ProjectTest{
    public static void main(String[] args) {
        Project project = new Project();
        Project secondProject = new Project("Dunder Mifflin");
        Project thirdProject = new Project("Party Planning Committee", "Plan Toby's going away party");
        Project fourthProject = new Project("Kevin's Famous Chili", "Spill chili in the office", 25.00);

        project.setName("Pranks on Dwight");
        project.setDescription("Move Dwight's desk to the bathroom");
        String projectName = project.getName();
        String someDescription = project.getDescription();
        System.out.println("Project Name: " + projectName);
        System.out.println("Description: " + someDescription);

        String projectName2 = secondProject.getName();
        String projectDescription2 = secondProject.getDescription();
        System.out.println("Project Name: " + projectName2);
        System.out.println("Description: " + projectDescription2);

        String projectName3 = thirdProject.getName();
        String projectDescription3 = thirdProject.getDescription();
        System.out.println("Project Name: " + projectName3);
        System.out.println("Description: " + projectDescription3);

        String projectName4 = fourthProject.getName();
        String projectDescription4 = fourthProject.getDescription();
        Double projectCost = fourthProject.getInitialCost();
        System.out.println("Project Name: " + projectName4);
        System.out.println("Description: " + projectDescription4);
        System.out.println("Cost: " + projectCost);

        String dunder = fourthProject.elevatorPitch();
        System.out.println(dunder);
    }
}