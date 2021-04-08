package space.fedosenko.CosmetologyQuizApp;

import java.util.ArrayList;
import java.util.Random;

public class Model {
    private static Model instance = new Model();
    private ArrayList<Question> questions;
    private ArrayList<Question> wrongAnswers = new ArrayList<>();
    private boolean failedQuestions = false;
    private int testNumber;
    private String testName;


    private Model() {
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }


    public void setFirstTestQuestions() {
        questions = new ArrayList<>();
        testNumber = 1;
        questions.add(new  Question("Which of the following will reinforce and reconstruct the hair shaft?", "Protein conditioner", "Scalp treatment", " Balancing shampoo", "Hair brushing"));
        questions.add(new Question("When damaged, which of the following will cause the hair growth to be inhibited?", "Papilla", "Shaft", "Cuticle", "Arrector pili"));
        questions.add(new Question("A condition caused by an infestation of head lice is", "pediculous capitalis", "tinea barbae", "scabies", "tinea capitis"));
        questions.add(new Question("Debris is removed from tools and implements using which of the following procedures?", "Cleaning", "Disinfection", "Sterilization", "Decontamination"));
        questions.add(new Question("What implement adds shine and smooths wavy ridges on the natural nail during a manicure?", "Nail buffer", "Coarse file", "Metal file", "Nail brush"));
        questions.add(new Question("What is another name for the dermis layer of the skin?", "True skin", "Basal cell", "Spiny layer", "Horny layer"));
        questions.add(new Question("The massage movement intended to soothe muscles is", "effleurage", "petrissage", "tapotement", "friction"));
        questions.add(new Question("What product can be used to equalize the porosity of the hair?", "Fillers", "Shampoo", "Lightener", "Developer"));
        questions.add(new Question("Anthrax and tetanus bacilli form which type of spore? ", "Spherical", "Mitosis", "Flagella", "Infectious"));
        questions.add( new Question("All French style shears", "have a finger brace", "are cobalt metal", "are made in France", "have tight pivots"));
        questions.add( new Question("Prior to a shaving service the headrest MUST be", "disinfected and covered", "washed and dried", "washed and removed", "sanitized and sterilized"));
        questions.add( new Question("To avoid damage to muscle tissue, the movements of a massage are directed ", "toward the origin of the muscle", "away from the origin of the muscle", "around the origin of the muscle", "above the origin of the muscle"));
        questions.add( new Question("Which of the following can permanently relieve split ends?", "Cutting the end", "Applying oil to the ends", "Using a styling gel on the ends ", "Moistening the ends "));
        questions.add( new Question("The diameter of a single strand of hair is also called ", "texture", "growth pattern", "porosity", "density"));
        questions.add( new Question("What should be performed FIRST before applying permanent haircolor?", "Patch test", "Strand test ", "Curl test", "Texture test"));
        questions.add( new Question("Before sodium hydroxide processing, hair should be analyzed to determine its ", "texture, porosity, and elasticity", "acidity", "alkalinity", "density, color, and end bonds"));
        questions.add( new Question("What is the term for the scientific study of the skin? ", "Dermatology", "Myology", "Angiology ", "Physiology "));
        questions.add( new Question("A product containing antiseptic reaches what level of decontamination? ", "Sanitation", "Disinfection", "Sterilization ", "Ionization"));
        questions.add( new Question("Which of the following is also referred to as the basal layer? ", "Stratum germinativum", "Stratum granulosum ", "Stratum lucidum", "Stratum corneum "));
        questions.add( new Question("During the anagen phase of hair growth, the hair is ", "actively growing", "beginning to destroy itself", "shedding", "disconnecting from the papilla"));
        questions.add( new Question("A new client schedules for a series of chemical exfoliation treatments. When should the consultation form be reviewed and signed?", "At each treatment ", "Monthly", "Annually ", "At the first treatment "));
        questions.add( new Question("Dilated capillaries that can be seen beneath the surface of the skin are known as ", "telangectasia", "seborrhea", "keratoma", " dehydrated"));
        questions.add( new Question("Melanocytes that are more active will produce ", "darker skin", "lighter skin", "sebaceous skin", "dry skin"));
        questions.add( new Question("In addition to softening sebum, another function of a facial steamer is to", "oxygenate the skin", "moisturize the skin", "decrease circulation", "detoxify the skin"));
        questions.add( new Question("Pumice stone is used in pedicuring as ", "an abrasive", "a bleach", "a lubricant", "an astringent"));
        questions.add( new Question("What is the FIRST step in performing a manicure? ", "Remove old polish ", "Shape the nails", "Soften the cuticles", "Clean under free edge "));
        questions.add( new Question("Where should all manicuring cosmetic supplies be kept when not being used? ", "In clean, closed containers ", "On a clean shelf", "On the manicuring table", "In a clean manicuring kit "));
        questions.add( new Question("Which one of the following is a condition in which the cuticle splits around the nail? ", "Hangnails ", "Pterygium", "Onychophagy ", "Onychorrhexis "));
        questions.add( new Question("Nerves and blood vessels are found in the nail ", "bed", "wall", "plate", "grooves"));
        questions.add( new Question("An antiseptic is used in manicuring to ", "treat minor cuts", "bleach the nails.", "smooth corrugated nails", "give the nails a high sheen"));
        questions.add( new Question("After each use, manicuring implements should be ", "cleansed and disinfected", "wiped with a towel", "wiped with a tissue", "placed in dry storage"));
        questions.add( new Question("For which one of the following are oil manicures recommended? ", "Brittle nails", "Leuconychia ", "Split nails ", "Prevention of infection "));
        questions.add( new Question("What is the actively growing part of the nail? ", "Matrix ", "Lunula", "Mantle", "Free edge "));
        questions.add( new Question("What should be applied to a split in the nail before wrapping it?", "Adhesive glue", "Top coat", "Base coat ", "Nail hardener"));
        questions.add( new Question("Disease producing bacteria are called ", "pathogenic", "hyperemia", "hypoallergenic", "nonpathogenic"));
        questions.add( new Question("Which of the following would result in the greatest production of lye?", "Increase both current and time", "Decrease both current and time", "Increase current and decrease time ", "Decrease current and increase time "));
        questions.add( new Question("Hair grows from the papilla by multiplication of the ", "matrix cells", "stratum lucidum", "papillary layer", "reticular region"));
        questions.add( new Question("What temporary method of hair removal accelerates the shedding of the horny layer of the skin?", "Depilatory", "Bleaching", "Threading", "Clipping"));
        questions.add( new Question("Electrolysis is recognized as the only proven method of permanent hair removal by the ", "Food and Drug Administration (FDA)", "Environmental Protection Agency (EPA", "Centers for Disease Control (CDC)", "Occupational Safety and Health Administration (OSHA)"));



    }
    private void setSecondTestQuestions(){
        questions = new ArrayList<>();
        testNumber = 2;
        testName = "Infection Control";
        questions.add(new  Question("Barbering tools and implements are designed for specific _____________.", "purposes", "barbers", "environments", "clients"));
        questions.add(new  Question("_____________ may contain antirust ingredients.", "Quat solutions", "Phenol", "Petroleum distillates", "Bleach"));
        questions.add(new  Question("Never mix ___________ together under any circumstances.", "cleaning products", "sawdust and chemicals", "water and shaving cream", "shampoos"));
        questions.add(new  Question("Clothing should be___________.", "comfortable", "excessively baggy", "loose", "tight"));
        questions.add(new  Question("_________ is a mechanical process (scrubbing) using soap and water or detergent and water.", "Cleaning", "Sanitizing", "Disinfection", "Sterilization"));
        questions.add(new  Question("Tuberculocidal disinfectants are often referred to as_________.", "phenolics", "wet sanitizers", "quats", "statutes"));
        questions.add(new  Question("Which of the following is the most powerful and important way to prevent the spread of infection?", "Handwashing.", "Use of heat.", "Use of an autoclave.", "Use of EPA-registered disinfectant."));
        questions.add(new  Question("Where should you test the water temperature before applying to a client’s hair or scalp?", "Inside of your wrist.", "Back of your hand.", "Palm of your hand.", "Your fingers."));
        questions.add(new  Question("Water heaters should not be set at higher than what temperature?", "130 degrees Fahrenheit.", "200 degrees Fahrenheit.", "175 degrees Fahrenheit.", "150 degrees Fahrenheit."));
        questions.add(new  Question("Which of the following does not spread the HIV virus?", "Sharing food.", "Sharing of needles.", "Contact with cuts and sores.", "Unprotected sexual contact."));
        questions.add(new  Question("Disinfectants must be registered with the ___________.", "EPA", "OSHA", "SDS", "HCS"));
        questions.add(new  Question("The majority of contaminants and pathogens can be removed from the surfaces of tools and implements through proper __________.", "cleaning", "mixing of disinfectants", "handwashing", "guidelines"));
        questions.add(new  Question("If you spill water while working at the shampoo bowl, you should __________.", "clean it up immediately", "let it dry on its own", "ask someone nearby to clean it up", "clean it up after the client leaves"));
        questions.add(new  Question("Lyme disease is caused by what type of bacteria?", "Spirilla.", "Bacilli.", "Diplococci.", "Staphylococci."));
        questions.add(new  Question("Which bacteria cause MRSA?", "Staphylococci.", "Spirilla.", "Streptococci.", "Diplococci."));
        questions.add(new  Question("What disease breaks down the body’s immune system?", "AIDS.", "MRSA.", "Hepatitis A.", "Hepatitis C."));
        questions.add(new  Question("__________ that stems from a knowledgeable and caring manner is what separates a true professional from a nonprofessional.", "Behavior", "Income", "Clothing", "Legal responsibility"));
        questions.add(new  Question("Laws are also called ___________.", "statutes", "regulations", "rules", "guidelines"));
        questions.add(new  Question("What should you use to cushion the client’s neck at the shampoo bowl?", "Folded towel.", "Neck strip.", "Cape.", "Pillow."));
        questions.add(new  Question("The EPA registers all types of __________ sold and used in the United States.", "disinfectants", "bacteria", "fungi", "viruses"));
        questions.add(new  Question("Due to the drying effect of alcohol, hand sanitizers should not be _________.", "overused", "cleaners", "diluted", "used as an antiseptic"));
        questions.add(new  Question("What type of disinfectant is a form of formaldehyde?", "Phenolics.", "Petroleum distillates.", "Bleach.", "Quaternary ammonium compounds."));
        questions.add(new  Question("It is your legal responsibility to keep your ____________ current.", "license", "clients", "shoes", "jewelry"));
        questions.add(new  Question("The body prevents and controls infections through__________.", "uncompromised skin", "weakened tissue", "broken skin", "unprotected sex"));
        questions.add(new  Question("It is the barber's responsibility to _________.", "be aware of changes to rules and regulations", "recommend changes to rules and regulations", "keep regulatory agencies informed about changes to regulations", "decide what constitutes legal standards of conduct"));
        questions.add(new  Question("Where are disinfecting jars usually placed?", "On the station countertop.", "Under a cabinet.", "On a shelf.", "Attached to a wall."));
        questions.add(new  Question("__________is the process that destroys all microbial life, including spores.", "Sterilization", "Sanitizing", "Cleaning", "Disinfection"));
        questions.add(new  Question("The CDC requires that autoclaves be tested weekly to ensure they are properly sterilizing implements, using a _________test.", "spore", "performance", "bacterial", "viral"));
        questions.add(new  Question("Do not allow children to play ___________.", "on the hydraulic chairs", "on the waiting room chairs", "on the floor", "in the reception area"));
        questions.add(new  Question("Effective sterilization typically requires the use of a(n)_________.", "autoclave", "multiuse tool", "hospital disinfectant", "UV light unit"));
        questions.add(new  Question("On a Safety Data Sheet, toxicology information would include which of the following?", "Routes of exposure.", "Chemical stability.", "Disposal techniques.", "Chemical characteristics."));
        questions.add(new  Question("Never take ___________ for cleaning and disinfecting.", "shortcuts", "more than a few minutes", "legal responsibility", "preventative measures"));
        questions.add(new  Question("Never overload electrical outlets or use ____________.", "extension cords", "electric latherizers", "GFCI outlets", "electrical cords"));
        questions.add(new  Question("OSHA was created as part of the ___________.", "U.S. Department of Labor", "United Nations", "state barber boards", "EPA"));
        questions.add(new  Question("When cutting a child’s hair, try to anticipate the child’s __________.", "sudden moves", "moods", "inquisitive nature", "hairstyle choice"));
        questions.add(new  Question("Alcohol should only be used as a cleaner or ____________.", "antiseptic", "sterilizer", "disinfectant", "bleach"));
        questions.add(new  Question("What type of disinfectant is similar in chemical structure to kerosene?", "Petroleum distillates", "Phenolic disinfectants", "Bleach", "Quats"));
        questions.add(new  Question("Who should be instructed in fire extinguisher use?", "All employees.", "The clients.", "Only the receptionist.", "Only the barbers."));
        questions.add(new  Question("__________ should not be used to disinfect or sterilize implements.", "Baby sterilizers", "Disinfectant containers", "Bleach", "Autoclaves"));
        questions.add(new  Question("It is important to wear __________ and gloves while disinfecting nonelectrical tools.", "safety glasses", "a cape", "earplugs", "an apron"));
        questions.add(new  Question("Cocci are generally transmitted in ___________.", "the air", "semen", "spores", "water"));
        questions.add(new  Question("The second step of infection control is __________.", "disinfection", "cleaning", "sterilization", "sanitation"));
        questions.add(new  Question("When a disease spreads from one person to another, the disease is said to be a(n)_______.", "contagious disease", "inflammation", "systemic infection", "local infection"));
        questions.add(new  Question("Disinfection is not effective against ___________.", "bacterial spores", "mold", "fungi", "viruses"));
        questions.add(new  Question("Staphylococci grow in what shape?", "Clusters, like bunches of grapes.", "Rod.", "Corkscrew.", "Pairs."));
        questions.add(new  Question("An autoclave is a piece of equipment that incorporates heat and________.", "pressure", "quaternary ammonium compounds", "phenolics", "chemicals"));
        questions.add(new  Question("Every solution, liquid, cream, powder, paste, gel, and other substance should be properly ___________.", "labeled", "cleaned", "disinfected", "diluted"));
        questions.add(new  Question("An EPA registration number certifies that a disinfectant _____________.", "is effective against the pathogens listed on the label", "has an appropriate water content for commercial use", "does not need to be mixed prior to application", "will destroy all known pathogens"));
        questions.add(new  Question("Hydrogen peroxide works well as an antiseptic at what percentage of strength?", "3 percent.", "5 percent.", "25 percent.", "10 percent."));
        questions.add(new  Question("The invasion of body tissues by disease-causing pathogens is called a(n)______.", "infection", "toxin", "immunity", "disease"));
        questions.add(new  Question("Hepatitis can live on a surface outside the body for__________.", "long periods of time", "only the contact time", "short periods of time", "approximately 10 minutes"));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));
        questions.add(new  Question("", "", "", "", ""));

    }
    public void changeTestNumber(){
        if (testNumber == 1){
            setSecondTestQuestions();
        } else {
            setFirstTestQuestions();
        }

    }
    public Question getNextQuestion() {
        Random random = new Random();



        if (failedQuestions) {
            int rand = random.nextInt(wrongAnswers.size());
            Question temp = wrongAnswers.get(rand);
            wrongAnswers.remove(rand);
            return temp;

        } else {

            int rand = random.nextInt(questions.size());
            Question temp = questions.get(rand);
            questions.remove(rand);
            return temp;
        }

    }
    public boolean hasMore(){
        if (failedQuestions) {
            return !(wrongAnswers.isEmpty());
        }else{
            return !(questions.isEmpty());
        }
    }

    public void addWrongAnswer(Question question) {
        wrongAnswers.add(question);
    }
    public int wrongQuestionsLeft(){
        return wrongAnswers.size();
    }
    public void setWrongAnswersMode(){
        failedQuestions=true;
    }
    public void setNormalAnswersMode(){
        failedQuestions=false;
    }
    public boolean getMode(){
        return failedQuestions;
    }

    public int getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(int testNumber) {
        this.testNumber = testNumber;
    }
}
