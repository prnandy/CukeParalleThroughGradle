@All
Feature: User Certification


    @User_Sceanrio1
    Scenario: User is Passed
        Given that the user Vinod is given a task to clear Java certification exam
        When Vinod got 60 marks in exam
        Then Vinod is known as Java certified
    
    @User_Sceanrio2
    Scenario: User is Passed
        Given that the user Alfiya is given a task to clear Java certification exam
        When Alfiya got 80 marks in exam
        Then Alfiya is known as Java certified

	@User_Sceanrio3
    Scenario: User is Passed
        Given that the user Kalpesh is given a task to clear Java certification exam
        When Kalpesh got 50 marks in exam
        Then Kalpesh is not known as Java certified
    
    @User_Sceanrio4
    Scenario: User is Passed
        Given that the user ABC is given a task to clear Java certification exam
        When ABC got 60 marks in exam
        Then ABC is known as Java certified
    
    @User_Sceanrio5    
    Scenario: User is Passed
        Given that the user MollyJane is given a task to clear Java certification exam
        When MollyJane got 60 marks in exam
        Then MollyJane is known as Java certified
    
    @User_Sceanrio6    
    Scenario: User is Failed
        Given that the user Hydra is given a task to clear Java certification exam
        When Hydra got 20 marks in exam
        Then Hydra is not known as Java certified           