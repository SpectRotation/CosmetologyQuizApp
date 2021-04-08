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
