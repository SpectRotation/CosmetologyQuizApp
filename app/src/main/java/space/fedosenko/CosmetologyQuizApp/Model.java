package space.fedosenko.CosmetologyQuizApp;

import java.util.ArrayList;
import java.util.Random;

public class Model {
    private static Model instance = new Model();
    ArrayList<Question> questions = new ArrayList<>();
    ArrayList<Question> wrongAnswers = new ArrayList<>();
    private boolean failedQuestions = false;

    private Model() {
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }


    Question q1 = new Question("Which of the following will reinforce and reconstruct the hair shaft?", "Protein conditioner", "Scalp treatment", " Balancing shampoo", "Hair brushing");
    Question q2 = new Question("When damaged, which of the following will cause the hair growth to be inhibited?", "Papilla", "Shaft", "Cuticle", "Arrector pili");
    Question q3 = new Question("A condition caused by an infestation of head lice is", "pediculous capitalis", "tinea barbae", "scabies", "tinea capitis");
    Question q4 = new Question("Debris is removed from tools and implements using which of the following procedures?", "Cleaning", "Disinfection", "Sterilization", "Decontamination");
    Question q5 = new Question("What implement adds shine and smooths wavy ridges on the natural nail during a manicure?", "Nail buffer", "Coarse file", "Metal file", "Nail brush");
    Question q6 = new Question("What is another name for the dermis layer of the skin?", "True skin", "Basal cell", "Spiny layer", "Horny layer");
    Question q7 = new Question("The massage movement intended to soothe muscles is", "effleurage", "petrissage", "tapotement", "friction");
    Question q8 = new Question("What product can be used to equalize the porosity of the hair?", "Fillers", "Shampoo", "Lightener", "Developer");

    Question q9 = new Question("Anthrax and tetanus bacilli form which type of spore? ", "Spherical", "Mitosis", "Flagella", "Infectious");
    Question q10 = new Question("All French style shears", "have a finger brace", "are cobalt metal", "are made in France", "have tight pivots");
    Question q11 = new Question("Prior to a shaving service the headrest MUST be", "disinfected and covered", "washed and dried", "washed and removed", "sanitized and sterilized");
    Question q12 = new Question("To avoid damage to muscle tissue, the movements of a massage are directed ", "toward the origin of the muscle", "away from the origin of the muscle", "around the origin of the muscle", "above the origin of the muscle");
    Question q13 = new Question("Which of the following can permanently relieve split ends?", "Cutting the end", "Applying oil to the ends", "Using a styling gel on the ends ", "Moistening the ends ");
    Question q14 = new Question("The diameter of a single strand of hair is also called ", "texture", "growth pattern", "porosity", "density");
    Question q15 = new Question("What should be performed FIRST before applying permanent haircolor?", "Patch test", "Strand test ", "Curl test", "Texture test");
    Question q16 = new Question("Before sodium hydroxide processing, hair should be analyzed to determine its ", "texture, porosity, and elasticity", "acidity", "alkalinity", "density, color, and end bonds");

    Question q17 = new Question("What is the term for the scientific study of the skin? ", "Dermatology", "Myology", "Angiology ", "Physiology ");
    Question q18 = new Question("A product containing antiseptic reaches what level of decontamination? ", "Sanitation", "Disinfection", "Sterilization ", "Ionization");
    Question q19 = new Question("Which of the following is also referred to as the basal layer? ", "Stratum germinativum", "Stratum granulosum ", "Stratum lucidum", "Stratum corneum ");
    Question q20 = new Question("During the anagen phase of hair growth, the hair is ", "actively growing", "beginning to destroy itself", "shedding", "disconnecting from the papilla");
    Question q21 = new Question("A new client schedules for a series of chemical exfoliation treatments. When should the consultation form be reviewed and signed?", "At each treatment ", "Monthly", "Annually ", "At the first treatment ");
    Question q22 = new Question("Dilated capillaries that can be seen beneath the surface of the skin are known as ", "telangectasia", "seborrhea", "keratoma", " dehydrated");
    Question q23 = new Question("Melanocytes that are more active will produce ", "darker skin", "lighter skin", "sebaceous skin", "dry skin");
    Question q24 = new Question("In addition to softening sebum, another function of a facial steamer is to", "oxygenate the skin", "moisturize the skin", "decrease circulation", "detoxify the skin");

    Question q25 = new Question("Pumice stone is used in pedicuring as ", "an abrasive", "a bleach", "a lubricant", "an astringent");
    Question q26 = new Question("What is the FIRST step in performing a manicure? ", "Remove old polish ", "Shape the nails", "Soften the cuticles", "Clean under free edge ");
    Question q27 = new Question("Where should all manicuring cosmetic supplies be kept when not being used? ", "In clean, closed containers ", "On a clean shelf", "On the manicuring table", "In a clean manicuring kit ");
    Question q28 = new Question("Which one of the following is a condition in which the cuticle splits around the nail? ", "Hangnails ", "Pterygium", "Onychophagy ", "Onychorrhexis ");
    Question q29 = new Question("Nerves and blood vessels are found in the nail ", "bed", "wall", "plate", "grooves");
    Question q30 = new Question("An antiseptic is used in manicuring to ", "treat minor cuts", "bleach the nails.", "smooth corrugated nails", "give the nails a high sheen");
    Question q31 = new Question("After each use, manicuring implements should be ", "cleansed and disinfected", "wiped with a towel", "wiped with a tissue", "placed in dry storage");
    Question q32 = new Question("For which one of the following are oil manicures recommended? ", "Brittle nails", "Leuconychia ", "Split nails ", "Prevention of infection ");
    Question q33 = new Question("What is the actively growing part of the nail? ", "Matrix ", "Lunula", "Mantle", "Free edge ");
    Question q34 = new Question("What should be applied to a split in the nail before wrapping it?", "Adhesive glue", "Top coat", "Base coat ", "Nail hardener");

    Question q35 = new Question("Disease producing bacteria are called ", "pathogenic", "hyperemia", "hypoallergenic", "nonpathogenic");
    Question q36 = new Question("Which of the following would result in the greatest production of lye?", "Increase both current and time", "Decrease both current and time", "Increase current and decrease time ", "Decrease current and increase time ");
    Question q37 = new Question("Hair grows from the papilla by multiplication of the ", "matrix cells", "stratum lucidum", "papillary layer", "reticular region");
    Question q38 = new Question("What temporary method of hair removal accelerates the shedding of the horny layer of the skin?", "Depilatory", "Bleaching", "Threading", "Clipping");
    Question q39 = new Question("Electrolysis is recognized as the only proven method of permanent hair removal by the ", "Food and Drug Administration (FDA)", "Environmental Protection Agency (EPA", "Centers for Disease Control (CDC)", "Occupational Safety and Health Administration (OSHA)");

    public void setQuestions() {


        //Question q = new Question("","","","","");

        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        questions.add(q6);
        questions.add(q7);
        questions.add(q8);
        questions.add(q9);
        questions.add(q10);
        questions.add(q11);
        questions.add(q12);
        questions.add(q13);
        questions.add(q14);
        questions.add(q15);
        questions.add(q16);
        questions.add(q17);
        questions.add(q18);
        questions.add(q19);
        questions.add(q20);
        questions.add(q21);
        questions.add(q22);
        questions.add(q23);
        questions.add(q24);
        questions.add(q25);
        questions.add(q26);
        questions.add(q27);
        questions.add(q28);
        questions.add(q29);
        questions.add(q30);
        questions.add(q31);
        questions.add(q32);
        questions.add(q33);
        questions.add(q34);
        questions.add(q35);
        questions.add(q36);
        questions.add(q37);
        questions.add(q38);
        questions.add(q39);



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
}
