package space.fedosenko.CosmetologyQuizApp;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

import static android.content.Context.MODE_PRIVATE;

public class Model {
    private static Model instance;
    private ArrayList<Question> test1;
    private ArrayList<Question> test2;
    private ArrayList<Question> test3;
    private ArrayList<Question> test4;
    private Context mContext;

    private Topic topic;
    private ArrayList<Question>  questions;
    private ArrayList<Question> wrongAnswers = new ArrayList<>();
    private boolean failedQuestions = false;
    private int testNumber;
    private String testName;
    private ArrayList<String> testNames = new ArrayList<>();
    private SharedPreferences  mPrefs;

    private Model() {

        testNames.add("First Test");
        testNames.add("Infection Control");
        testNames.add("Anatomy and Physiology");
        testNames.add("Skin Structure, Disorders, and Disease");
        testNames.add("Properties and Disorders of the Hair");
        testNames.add("Wrong Answers");


    }
    public void setTopic(String name){
        Gson gson = new Gson();

        String json = mPrefs.getString(name, "");
        topic = gson.fromJson(json, Topic.class);
    }
    private void initAllTopics(){
        ArrayList<Topic> topics = setQuestions();
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson;
        String json;
        for (int i = 0; i < testNames.size(); i++) {
            gson = new Gson();
            json = gson.toJson(topics.get(i));
            prefsEditor.putString(topics.get(i).getName(), json);

        }
        prefsEditor.apply();
    }
    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }



    private ArrayList<Topic> setQuestions() {

        ArrayList<Topic> topics = new ArrayList<>();
        topics.add(new Topic(testNames.get(0)));
        topics.add(new Topic(testNames.get(1)));
        topics.add(new Topic(testNames.get(2)));
        topics.add(new Topic(testNames.get(3)));
        topics.add(new Topic(testNames.get(4)));
        topics.add(new Topic(testNames.get(5)));

        topics.get(0).addQuestion(new Question("Which of the following will reinforce and reconstruct the hair shaft?", "Protein conditioner", "Scalp treatment", " Balancing shampoo", "Hair brushing"));
        topics.get(0).addQuestion(new Question("When damaged, which of the following will cause the hair growth to be inhibited?", "Papilla", "Shaft", "Cuticle", "Arrector pili"));
        topics.get(0).addQuestion(new Question("A condition caused by an infestation of head lice is", "pediculous capitalis", "tinea barbae", "scabies", "tinea capitis"));
        topics.get(0).addQuestion(new Question("Debris is removed from tools and implements using which of the following procedures?", "Cleaning", "Disinfection", "Sterilization", "Decontamination"));
        topics.get(0).addQuestion(new Question("What implement adds shine and smooths wavy ridges on the natural nail during a manicure?", "Nail buffer", "Coarse file", "Metal file", "Nail brush"));
        topics.get(0).addQuestion(new Question("What is another name for the dermis layer of the skin?", "True skin", "Basal cell", "Spiny layer", "Horny layer"));
        topics.get(0).addQuestion(new Question("The massage movement intended to soothe muscles is", "effleurage", "petrissage", "tapotement", "friction"));
        topics.get(0).addQuestion(new Question("What product can be used to equalize the porosity of the hair?", "Fillers", "Shampoo", "Lightener", "Developer"));
        topics.get(0).addQuestion(new Question("Anthrax and tetanus bacilli form which type of spore? ", "Spherical", "Mitosis", "Flagella", "Infectious"));
        topics.get(0).addQuestion(new Question("All French style shears", "have a finger brace", "are cobalt metal", "are made in France", "have tight pivots"));
        topics.get(0).addQuestion(new Question("Prior to a shaving service the headrest MUST be", "disinfected and covered", "washed and dried", "washed and removed", "sanitized and sterilized"));
        topics.get(0).addQuestion(new Question("To avoid damage to muscle tissue, the movements of a massage are directed ", "toward the origin of the muscle", "away from the origin of the muscle", "around the origin of the muscle", "above the origin of the muscle"));
        topics.get(0).addQuestion(new Question("Which of the following can permanently relieve split ends?", "Cutting the end", "Applying oil to the ends", "Using a styling gel on the ends ", "Moistening the ends "));
        topics.get(0).addQuestion(new Question("The diameter of a single strand of hair is also called ", "texture", "growth pattern", "porosity", "density"));
        topics.get(0).addQuestion(new Question("What should be performed FIRST before applying permanent haircolor?", "Patch test", "Strand test ", "Curl test", "Texture test"));
        topics.get(0).addQuestion(new Question("Before sodium hydroxide processing, hair should be analyzed to determine its ", "texture, porosity, and elasticity", "acidity", "alkalinity", "density, color, and end bonds"));
        topics.get(0).addQuestion(new Question("What is the term for the scientific study of the skin? ", "Dermatology", "Myology", "Angiology ", "Physiology "));
        topics.get(0).addQuestion(new Question("A product containing antiseptic reaches what level of decontamination? ", "Sanitation", "Disinfection", "Sterilization ", "Ionization"));
        topics.get(0).addQuestion(new Question("Which of the following is also referred to as the basal layer? ", "Stratum germinativum", "Stratum granulosum ", "Stratum lucidum", "Stratum corneum "));
        topics.get(0).addQuestion(new Question("During the anagen phase of hair growth, the hair is ", "actively growing", "beginning to destroy itself", "shedding", "disconnecting from the papilla"));
        topics.get(0).addQuestion(new Question("A new client schedules for a series of chemical exfoliation treatments. When should the consultation form be reviewed and signed?", "At each treatment ", "Monthly", "Annually ", "At the first treatment "));
        topics.get(0).addQuestion(new Question("Dilated capillaries that can be seen beneath the surface of the skin are known as ", "telangectasia", "seborrhea", "keratoma", " dehydrated"));
        topics.get(0).addQuestion(new Question("Melanocytes that are more active will produce ", "darker skin", "lighter skin", "sebaceous skin", "dry skin"));
        topics.get(0).addQuestion(new Question("In addition to softening sebum, another function of a facial steamer is to", "oxygenate the skin", "moisturize the skin", "decrease circulation", "detoxify the skin"));
        topics.get(0).addQuestion(new Question("Pumice stone is used in pedicuring as ", "an abrasive", "a bleach", "a lubricant", "an astringent"));
        topics.get(0).addQuestion(new Question("What is the FIRST step in performing a manicure? ", "Remove old polish ", "Shape the nails", "Soften the cuticles", "Clean under free edge "));
        topics.get(0).addQuestion(new Question("Where should all manicuring cosmetic supplies be kept when not being used? ", "In clean, closed containers ", "On a clean shelf", "On the manicuring table", "In a clean manicuring kit "));
        topics.get(0).addQuestion(new Question("Which one of the following is a condition in which the cuticle splits around the nail? ", "Hangnails ", "Pterygium", "Onychophagy ", "Onychorrhexis "));
        topics.get(0).addQuestion(new Question("Nerves and blood vessels are found in the nail ", "bed", "wall", "plate", "grooves"));
        topics.get(0).addQuestion(new Question("An antiseptic is used in manicuring to ", "treat minor cuts", "bleach the nails.", "smooth corrugated nails", "give the nails a high sheen"));
        topics.get(0).addQuestion(new Question("After each use, manicuring implements should be ", "cleansed and disinfected", "wiped with a towel", "wiped with a tissue", "placed in dry storage"));
        topics.get(0).addQuestion(new Question("For which one of the following are oil manicures recommended? ", "Brittle nails", "Leuconychia ", "Split nails ", "Prevention of infection "));
        topics.get(0).addQuestion(new Question("What is the actively growing part of the nail? ", "Matrix ", "Lunula", "Mantle", "Free edge "));
        topics.get(0).addQuestion(new Question("What should be applied to a split in the nail before wrapping it?", "Adhesive glue", "Top coat", "Base coat ", "Nail hardener"));
        topics.get(0).addQuestion(new Question("Disease producing bacteria are called ", "pathogenic", "hyperemia", "hypoallergenic", "nonpathogenic"));
        topics.get(0).addQuestion(new Question("Which of the following would result in the greatest production of lye?", "Increase both current and time", "Decrease both current and time", "Increase current and decrease time ", "Decrease current and increase time "));
        topics.get(0).addQuestion(new Question("Hair grows from the papilla by multiplication of the ", "matrix cells", "stratum lucidum", "papillary layer", "reticular region"));
        topics.get(0).addQuestion(new Question("What temporary method of hair removal accelerates the shedding of the horny layer of the skin?", "Depilatory", "Bleaching", "Threading", "Clipping"));
        topics.get(0).addQuestion(new Question("Electrolysis is recognized as the only proven method of permanent hair removal by the ", "Food and Drug Administration (FDA)", "Environmental Protection Agency (EPA", "Centers for Disease Control (CDC)", "Occupational Safety and Health Administration (OSHA)"));


        topics.get(1).addQuestion(new  Question("Barbering tools and implements are designed for specific _____________.", "purposes", "barbers", "environments", "clients"));
        topics.get(1).addQuestion(new  Question("_____________ may contain antirust ingredients.", "Quat solutions", "Phenol", "Petroleum distillates", "Bleach"));
        topics.get(1).addQuestion(new  Question("Never mix ___________ together under any circumstances.", "cleaning products", "sawdust and chemicals", "water and shaving cream", "shampoos"));
        topics.get(1).addQuestion(new  Question("Clothing should be___________.", "comfortable", "excessively baggy", "loose", "tight"));
        topics.get(1).addQuestion(new  Question("_________ is a mechanical process (scrubbing) using soap and water or detergent and water.", "Cleaning", "Sanitizing", "Disinfection", "Sterilization"));
        topics.get(1).addQuestion(new  Question("Tuberculocidal disinfectants are often referred to as_________.", "phenolics", "wet sanitizers", "quats", "statutes"));
        topics.get(1).addQuestion(new  Question("Which of the following is the most powerful and important way to prevent the spread of infection?", "Handwashing.", "Use of heat.", "Use of an autoclave.", "Use of EPA-registered disinfectant."));
        topics.get(1).addQuestion(new  Question("Where should you test the water temperature before applying to a client’s hair or scalp?", "Inside of your wrist.", "Back of your hand.", "Palm of your hand.", "Your fingers."));
        topics.get(1).addQuestion(new  Question("Water heaters should not be set at higher than what temperature?", "130 degrees Fahrenheit.", "200 degrees Fahrenheit.", "175 degrees Fahrenheit.", "150 degrees Fahrenheit."));
        topics.get(1).addQuestion(new  Question("Which of the following does not spread the HIV virus?", "Sharing food.", "Sharing of needles.", "Contact with cuts and sores.", "Unprotected sexual contact."));
        topics.get(1).addQuestion(new  Question("Disinfectants must be registered with the ___________.", "EPA", "OSHA", "SDS", "HCS"));
        topics.get(1).addQuestion(new  Question("The majority of contaminants and pathogens can be removed from the surfaces of tools and implements through proper __________.", "cleaning", "mixing of disinfectants", "handwashing", "guidelines"));
        topics.get(1).addQuestion(new  Question("If you spill water while working at the shampoo bowl, you should __________.", "clean it up immediately", "let it dry on its own", "ask someone nearby to clean it up", "clean it up after the client leaves"));
        topics.get(1).addQuestion(new  Question("Lyme disease is caused by what type of bacteria?", "Spirilla.", "Bacilli.", "Diplococci.", "Staphylococci."));
        topics.get(1).addQuestion(new  Question("Which bacteria cause MRSA?", "Staphylococci.", "Spirilla.", "Streptococci.", "Diplococci."));
        topics.get(1).addQuestion(new  Question("What disease breaks down the body’s immune system?", "AIDS.", "MRSA.", "Hepatitis A.", "Hepatitis C."));
        topics.get(1).addQuestion(new  Question("__________ that stems from a knowledgeable and caring manner is what separates a true professional from a nonprofessional.", "Behavior", "Income", "Clothing", "Legal responsibility"));
        topics.get(1).addQuestion(new  Question("Laws are also called ___________.", "statutes", "regulations", "rules", "guidelines"));
        topics.get(1).addQuestion(new  Question("What should you use to cushion the client’s neck at the shampoo bowl?", "Folded towel.", "Neck strip.", "Cape.", "Pillow."));
        topics.get(1).addQuestion(new  Question("The EPA registers all types of __________ sold and used in the United States.", "disinfectants", "bacteria", "fungi", "viruses"));
        topics.get(1).addQuestion(new  Question("Due to the drying effect of alcohol, hand sanitizers should not be _________.", "overused", "cleaners", "diluted", "used as an antiseptic"));
        topics.get(1).addQuestion(new  Question("What type of disinfectant is a form of formaldehyde?", "Phenolics.", "Petroleum distillates.", "Bleach.", "Quaternary ammonium compounds."));
        topics.get(1).addQuestion(new  Question("It is your legal responsibility to keep your ____________ current.", "license", "clients", "shoes", "jewelry"));
        topics.get(1).addQuestion(new  Question("The body prevents and controls infections through__________.", "uncompromised skin", "weakened tissue", "broken skin", "unprotected sex"));
        topics.get(1).addQuestion(new  Question("It is the barber's responsibility to _________.", "be aware of changes to rules and regulations", "recommend changes to rules and regulations", "keep regulatory agencies informed about changes to regulations", "decide what constitutes legal standards of conduct"));
        topics.get(1).addQuestion(new  Question("Where are disinfecting jars usually placed?", "On the station countertop.", "Under a cabinet.", "On a shelf.", "Attached to a wall."));
        topics.get(1).addQuestion(new  Question("__________is the process that destroys all microbial life, including spores.", "Sterilization", "Sanitizing", "Cleaning", "Disinfection"));
        topics.get(1).addQuestion(new  Question("The CDC requires that autoclaves be tested weekly to ensure they are properly sterilizing implements, using a _________test.", "spore", "performance", "bacterial", "viral"));
        topics.get(1).addQuestion(new  Question("Do not allow children to play ___________.", "on the hydraulic chairs", "on the waiting room chairs", "on the floor", "in the reception area"));
        topics.get(1).addQuestion(new  Question("Effective sterilization typically requires the use of a(n)_________.", "autoclave", "multiuse tool", "hospital disinfectant", "UV light unit"));
        topics.get(1).addQuestion(new  Question("On a Safety Data Sheet, toxicology information would include which of the following?", "Routes of exposure.", "Chemical stability.", "Disposal techniques.", "Chemical characteristics."));
        topics.get(1).addQuestion(new  Question("Never take ___________ for cleaning and disinfecting.", "shortcuts", "more than a few minutes", "legal responsibility", "preventative measures"));
        topics.get(1).addQuestion(new  Question("Never overload electrical outlets or use ____________.", "extension cords", "electric latherizers", "GFCI outlets", "electrical cords"));
        topics.get(1).addQuestion(new  Question("OSHA was created as part of the ___________.", "U.S. Department of Labor", "United Nations", "state barber boards", "EPA"));
        topics.get(1).addQuestion(new  Question("When cutting a child’s hair, try to anticipate the child’s __________.", "sudden moves", "moods", "inquisitive nature", "hairstyle choice"));
        topics.get(1).addQuestion(new  Question("Alcohol should only be used as a cleaner or ____________.", "antiseptic", "sterilizer", "disinfectant", "bleach"));
        topics.get(1).addQuestion(new  Question("What type of disinfectant is similar in chemical structure to kerosene?", "Petroleum distillates", "Phenolic disinfectants", "Bleach", "Quats"));
        topics.get(1).addQuestion(new  Question("Who should be instructed in fire extinguisher use?", "All employees.", "The clients.", "Only the receptionist.", "Only the barbers."));
        topics.get(1).addQuestion(new  Question("__________ should not be used to disinfect or sterilize implements.", "Baby sterilizers", "Disinfectant containers", "Bleach", "Autoclaves"));
        topics.get(1).addQuestion(new  Question("It is important to wear __________ and gloves while disinfecting nonelectrical tools.", "safety glasses", "a cape", "earplugs", "an apron"));
        topics.get(1).addQuestion(new  Question("Cocci are generally transmitted in ___________.", "the air", "semen", "spores", "water"));
        topics.get(1).addQuestion(new  Question("The second step of infection control is __________.", "disinfection", "cleaning", "sterilization", "sanitation"));
        topics.get(1).addQuestion(new  Question("When a disease spreads from one person to another, the disease is said to be a(n)_______.", "contagious disease", "inflammation", "systemic infection", "local infection"));
        topics.get(1).addQuestion(new  Question("Disinfection is not effective against ___________.", "bacterial spores", "mold", "fungi", "viruses"));
        topics.get(1).addQuestion(new  Question("Staphylococci grow in what shape?", "Clusters, like bunches of grapes.", "Rod.", "Corkscrew.", "Pairs."));
        topics.get(1).addQuestion(new  Question("An autoclave is a piece of equipment that incorporates heat and________.", "pressure", "quaternary ammonium compounds", "phenolics", "chemicals"));
        topics.get(1).addQuestion(new  Question("Every solution, liquid, cream, powder, paste, gel, and other substance should be properly ___________.", "labeled", "cleaned", "disinfected", "diluted"));
        topics.get(1).addQuestion(new  Question("An EPA registration number certifies that a disinfectant _____________.", "is effective against the pathogens listed on the label", "has an appropriate water content for commercial use", "does not need to be mixed prior to application", "will destroy all known pathogens"));
        topics.get(1).addQuestion(new  Question("Hydrogen peroxide works well as an antiseptic at what percentage of strength?", "3 percent.", "5 percent.", "25 percent.", "10 percent."));
        topics.get(1).addQuestion(new  Question("The invasion of body tissues by disease-causing pathogens is called a(n)______.", "infection", "toxin", "immunity", "disease"));
        topics.get(1).addQuestion(new  Question("Hepatitis can live on a surface outside the body for__________.", "long periods of time", "only the contact time", "short periods of time", "approximately 10 minutes"));
        topics.get(1).addQuestion(new  Question("What bloodborne virus can damage the liver?", "Hepatitis.", "HIV.", "AIDS.", "MRSA."));
        topics.get(1).addQuestion(new  Question("State regulatory agencies include ___________.", "the EPA", "OSHA", "hospitals", "health departments"));
        topics.get(1).addQuestion(new  Question("If you accidentally cut a client, what should you do first?", "Stop the service immediately.", "Wash your hands.", "Calmly apologize.", "Apply slight pressure to the area."));
        topics.get(1).addQuestion(new  Question("You should never mix __________.", "detergents and bleach", "detergents and water", "bleach and water", "concentrated disinfectants and water"));
        topics.get(1).addQuestion(new  Question("State agencies regulate____________.", "licensing", "chemical ingredients", "use of equipment", "manufacturing of equipment"));
        topics.get(1).addQuestion(new  Question("Disinfectants are a type of ___________.", "poison", "nutrient", "residue", "immunity"));
        topics.get(1).addQuestion(new  Question("Fumes from chemical applications and nail care products require filtration units that cleanse and ____________ the air.", "detoxify", "disinfect", "cool", "heat"));
        topics.get(1).addQuestion(new  Question("Do not try to________ tools yourself.", "repair", "purchase", "disinfect", "clean"));
        topics.get(1).addQuestion(new  Question("Rings should not be worn on the _________,as they might interfere with haircutting accuracy.", "index fingers", "pinky fingers", "thumbs", "ring fingers"));
        topics.get(1).addQuestion(new  Question("In the barbershop, the spread of bloodborne pathogens is possible during _________.", "haircutting", "brushing", "shampooing", "blowdrying"));
        topics.get(1).addQuestion(new  Question("What type of hepatitis is the most difficult to kill on a surface?", "Hepatitis B.", "Hepatitis A.", "Hepatitis C.", "Hepatitis E."));
        topics.get(1).addQuestion(new  Question("Fire extinguishers should be placed where they are________.", "readily accessible", "away from clients", "locked in a safe place", "near ventilation"));
        topics.get(1).addQuestion(new  Question("How long should an item remain submerged in the disinfectant?", "10 minutes.", "20 minutes.", "60 minutes.", "2 minutes."));
        topics.get(1).addQuestion(new  Question("Bacteria with flagella move in what type of motion?", "Snakelike.", "Rowing-like.", "Vertical.", "Sudden."));
        topics.get(1).addQuestion(new  Question("Disinfectants can be safely applied to __________.", "non-porous surfaces", "nails", "skin", "hair"));
        topics.get(1).addQuestion(new  Question("You should be prepared for ____________.", "emergencies", "unattended children", "tool repair", "non-professionalism"));
        topics.get(1).addQuestion(new  Question("Staphylococci cause which of the following?", "Boils.", "Blood poisoning.", "Tetanus.", "Pneumonia."));
        topics.get(1).addQuestion(new  Question("Which of the following is an example of a bloodborne virus?", "HIV.", "Cystic fibrosis.", "Otitis media.", "Conjunctivitis."));
        topics.get(1).addQuestion(new  Question("When cutting a child’s hair, hold the child’s head ___________.", "gently but firmly", "at the nape of the neck", "loosely", "with force"));
        topics.get(1).addQuestion(new  Question("Petroleum distillates are excellent at removing __________ from metals.", "oils", "spores", "discoloration", "scratches"));
        topics.get(1).addQuestion(new  Question("Assist clients (especially ________) in and out of hydraulic and shampoo chairs.", "the elderly", "men", "teenagers", "women"));
        topics.get(1).addQuestion(new  Question("Which of the following can grow in bar soaps?", "Bacteria.", "Mold.", "Fungi.", "Viruses."));
        topics.get(1).addQuestion(new  Question("Bacteria multiply best in what type of places?", "Warm.", "Cold.", "Dry.", "Clean."));
        topics.get(1).addQuestion(new  Question("When working at the shampoo bowl, you should avoid __________.", "twisting your waist", "holding your shoulders level", "balancing your neck over your shoulders", "keeping your back straight"));
        topics.get(1).addQuestion(new  Question("Federal and state laws require that manufacturers supply a Safety Data Sheet for all ________ products manufactured and sold.", "chemical", "mechanical", "commercial", "electrical"));
        topics.get(1).addQuestion(new  Question("Keep hair pulled back or short enough to avoid ____________.", "entanglements", "skin irritations", "getting wet", "dirt buildup"));
        topics.get(1).addQuestion(new  Question("Bleach solution should be stored ____________.", "away from heat and light", "away from other solutions", "somewhere damp", "near heat and light"));
        topics.get(1).addQuestion(new  Question("Phenolics are known _________.", "carcinogens", "pathogens", "contaminants", "allergens"));
        topics.get(1).addQuestion(new  Question("_________ is the ability to produce the intended effect.", "Efficacy", "Concentration", "Contact time", "Accuracy"));
        topics.get(1).addQuestion(new  Question("__________are used only for storage of disinfected items.", "UV light units", "Workstations", "Store rooms", "Reception areas"));
        topics.get(1).addQuestion(new  Question("What should you wear when pouring or mixing products?", "Goggles.", "Apron.", "White coat.", "Nonskid shoes."));
        topics.get(1).addQuestion(new  Question("Your most important responsibility is to _____________.", "protect your clients’ health and safety", "recommend products", "know a chemical’s characteristics", "know federal and state manufacturing laws"));
        topics.get(1).addQuestion(new  Question("___________ will not disinfect or sterilize implements.", "UV light units", "Bleach", "Phenolics", "Autoclaves"));
        topics.get(1).addQuestion(new  Question("A(n)________is contact with nonintact skin, blood, body fluid, or other potentially infectious materials.", "exposure incident", "communicable incident", "precautionary incident", "accident"));
        topics.get(1).addQuestion(new  Question("If a tool or implement is dropped on the floor during a service, it must be replaced with a ___________tool.", "disinfected", "cleaned", "sterilized", "contaminated"));
        topics.get(1).addQuestion(new  Question("Never place any tool or implement in your ___________.", "pocket", "workstation", "countertop receptacles", "disinfecting jar"));
        topics.get(1).addQuestion(new  Question("Blood may carry dangerous _________, so you should never touch an open sore or a wound.", "pathogens", "nonpathogens", "allergens", "nutrients"));
        topics.get(1).addQuestion(new  Question("Strict __________ practices should be used with all clients.", "infection control", "emergency", "surgical", "first-aid"));
        topics.get(1).addQuestion(new  Question("Showing no symptoms or signs of infection is considered being _________.", "asymptomatic", "communicable", "contagious", "symptomatic"));
        topics.get(1).addQuestion(new  Question("The presence of _________ is a sign of a bacterial infection.", "pus", "spores", "blood", "oiliness"));

        topics.get(2).addQuestion(new  Question("What scalp muscle causes wrinkles across the forehead?", "Frontalis", "Epicranius", "Epicranial aponeurosis", "Occipitalis"));
        topics.get(2).addQuestion(new  Question("What muscle in the chest assists with breathing?", "Serratus anterior", "Pectoralis minor", "Bicep", "Pectoralis major"));
        topics.get(2).addQuestion(new  Question("What nervous system in the body includes the brain?", "Central nervous system.", "Autonomic nervous system.", "Somatic nervous system.", "Peripheral nervous system."));
        topics.get(2).addQuestion(new  Question("An example of an endocrine gland would be a(n) __________ gland.", "pituitary", "sweat", "oil", "duct"));
        topics.get(2).addQuestion(new  Question("An example of connective tissue would be__________.", "lymph", "neurons", "glands", "the lining of the heart"));
        topics.get(2).addQuestion(new  Question("The word ending -ology means ___________.", "“study of”", "“part of”", "“science of”", "“map of”"));
        topics.get(2).addQuestion(new  Question("Where do the cervical or spinal nerves originate?", "Spinal cord", "Brain", "Vertebrae", "Spinal column"));
        topics.get(2).addQuestion(new  Question("What type of glands release hormonal secretions directly into the bloodstream?", "Endocrine", "Oil", "Exocrine", "Duct"));
        topics.get(2).addQuestion(new  Question("What color is blood in the veins?", "Dark red", "Light pink", "Bright red", "Dark pink"));
        topics.get(2).addQuestion(new  Question("What artery supplies blood to the forehead?", "Frontal", "Transverse facial", "Middle temporal", "Submental"));
        topics.get(2).addQuestion(new  Question("The cell membrane is the cell wall that encloses the ________.", "protoplasm", "yolk", "cytoplasm", "nucleus"));
        topics.get(2).addQuestion(new  Question("What body system destroys disease-causing microorganisms?", "Lymphatic/immune", "Integumentary", "Excretory", "Circulatory"));
        topics.get(2).addQuestion(new  Question("What part of a cell is needed for growth, reproduction, and self-repair?", "The cytoplasm.", "The nucleus.", "The cell membrane.", "The protoplasm."));
        topics.get(2).addQuestion(new  Question("What hormone is primarily present in females?", "Estrogen", "Insulin", "Adrenaline", "Testosterone"));
        topics.get(2).addQuestion(new  Question("The ________ system helps to regulate the body’s temperature.", "integumentary", "circulatory", "muscular", "endocrine"));
        topics.get(2).addQuestion(new  Question("How many bones are in the body?", "206", "230", "140", "120"));
        topics.get(2).addQuestion(new  Question("An oval, bony case that protects the brain is the _________.", "cranium", "maxillae", "thorax", "mandible"));
        topics.get(2).addQuestion(new  Question("Which of the following bring nutrients to the cells and carry away waste materials?", "Capillaries", "Venules", "Arterioles", "Arteries"));
        topics.get(2).addQuestion(new  Question("In the hand, ____________ draw the fingers together.", "adductors", "abductors", "extensors", "pronators"));
        topics.get(2).addQuestion(new  Question("The muscular system functions to_____________.", "help produce movement within the body", "carry impulses from the central nervous system", "transport blood to and from the heart", "help produce both white and red blood cells"));
        topics.get(2).addQuestion(new  Question("What U-shaped bone(s) is located at the base of tongue?", "Hyoid", "Phalanges", "Thorax", "Zygomatic"));
        topics.get(2).addQuestion(new  Question("Which of the following helps carry wastes and impurities away from the cells before it is routed back to the circulatory system?", "Lymph", "Blood", "Interstitial fluid", "Water"));
        topics.get(2).addQuestion(new  Question("A normal adult heart beats about how many times per minute?", "60 to 80", "100 to 110", "90 to 120", "40 to 50"));
        topics.get(2).addQuestion(new  Question("What is the largest organ of the body?", "the skin", "the lungs", "the heart", "the brain"));
        topics.get(2).addQuestion(new  Question("What muscle would you be using if you were grinning?", "Risorius", "Depressor labii inferioris", "Zygomaticus major", "Levator labii superioris"));
        topics.get(2).addQuestion(new  Question("Reflexes do not have to be learned because they are _________.", "automatic", "superficial", "voluntary", "permanent"));
        topics.get(2).addQuestion(new  Question("What does the word integument mean?", "Natural covering", "Map", "Bone", "Study of"));
        topics.get(2).addQuestion(new  Question("What body system provides a suitable fluid environment for the cells?", "Lymphatic/immune", "Circulatory", "Integumentary", "Endocrine"));
        topics.get(2).addQuestion(new  Question("Facial hair growth and color is a result of_____________.", "changing or fluctuating hormones", "a lack of immunities", "inflammation of the tissue", "body temperature"));
        topics.get(2).addQuestion(new  Question("One of the functions of bone marrow is to produce_________.", "white and red blood cells", "hormones", "minerals", "movement within the body"));
        topics.get(2).addQuestion(new  Question("Motor nerves carry impulses from the brain to the _________.", "muscles", "skin", "brain", "nose"));
        topics.get(2).addQuestion(new  Question("An example of a hormone is __________.", "estrogen", "blood", "oil", "sweat"));
        topics.get(2).addQuestion(new  Question("What artery supplies blood to the brain?", "Internal carotid", "External carotid", "Submental", "Facial"));
        topics.get(2).addQuestion(new  Question("A(n) ___________ is the primary structural unit of the nervous system.", "neuron", "axon", "dendrite", "axon terminal"));
        topics.get(2).addQuestion(new  Question("Which of the following is the largest and most complex organization of nerve tissue?", "Brain.", "Cranial nerves.", "Spinal nerves.", "Spinal cord."));
        topics.get(2).addQuestion(new  Question("Which of the following is the chief sensory nerve of the face?", "Trifacial nerve.", "Mental nerve.", "Mandibular nerve.", "Maxillary nerve."));
        topics.get(2).addQuestion(new  Question("What type of tissue is bone composed of?", "Connective", "Nerve", "Muscle", "Epithelial"));
        topics.get(2).addQuestion(new  Question("The seventh cranial nerve is also known as the_______nerve.", "facial", "trigeminal", "accessory", "trifacial"));
        topics.get(2).addQuestion(new  Question("__________ are thick-walled, muscular, flexible tubes.", "Arteries", "Venules", "Arterioles", "Capillaries"));
        topics.get(2).addQuestion(new  Question("________ tissue is a technical term for fat.", "Adipose", "Nerve", "Epithelial", "Muscle"));
        topics.get(2).addQuestion(new  Question("Which of the following is the largest bone of the arm?", "Humerus", "Ulna", "Carpus", "Radius"));
        topics.get(2).addQuestion(new  Question("The ______ bone joins all of the bones of the cranium together.", "sphenoid", "frontal", "ethmoid", "zygomatic"));
        topics.get(2).addQuestion(new  Question("The orbicularis oculi muscle_______________.", "enables you to close your eyes", "can easily be damaged during makeup application", "wrinkles the forehead vertically", "draws the eyebrows down"));
        topics.get(2).addQuestion(new  Question("What body system controls and coordinates the functions of all the other systems?", "Nervous", "Muscular", "Circulatory", "Endocrine"));
        topics.get(2).addQuestion(new  Question("A _______ is the connection between two or more bones of the skeleton.", "joint", "ligament", "tendon", "muscle"));
        topics.get(2).addQuestion(new  Question("One of the functions of the lymphatic/immune system is to__________.", "act as a defense against toxins and bacteria", "pass on the genetic code", "stimulate functional activity", "supply oxygen and eliminate carbon dioxide"));
        topics.get(2).addQuestion(new  Question("The lymphatic/immune system is closely connected to what other body system?", "Cardiovascular", "Nervous", "Reproductive", "Endocrine"));
        topics.get(2).addQuestion(new  Question("The largest artery in the body is the _______.", "aorta", "temporal", "carotid", "facial"));
        topics.get(2).addQuestion(new  Question("The middle part of a muscle is called the____________.", "belly", "nuclei", "origin", "insertion"));
        topics.get(2).addQuestion(new  Question("_________ is the science of the structure of organisms or of their parts.", "Anatomy", "Osteology", "Physiology", "Histology"));
        topics.get(2).addQuestion(new  Question("__________ is the study of the structure, functioning, and diseases of the muscles.", "Myology", "Histology", "Physiology", "Osteology"));
        topics.get(2).addQuestion(new  Question("Keeping the wrist in what position will help to prevent injuries?", "Straight", "Locked", "Bent", "Flexed"));
        topics.get(2).addQuestion(new  Question("What percentage of blood is water?", "80 percent", "50 percent", "25 percent", "63 percent"));
        topics.get(2).addQuestion(new  Question("The muscular system comprises what percentage of the body’s weight?", "40 to 50 percent", "80 percent", "25 percent", "15 to 20 percent"));
        topics.get(2).addQuestion(new  Question("What type of muscle is not duplicated anywhere else in the body?", "Cardiac", "Nonstriated", "Voluntary", "Smooth"));
        topics.get(2).addQuestion(new  Question("Nonstriated muscles are found where in the body?", "Intestines", "Hands", "Face", "Heart"));
        topics.get(2).addQuestion(new  Question("The _____________ circulation system takes deoxygenated blood to the lungs for oxygenation and waste removal and then returns that blood to the heart.", "pulmonary", "general", "cardiovascular", "systemic"));
        topics.get(2).addQuestion(new  Question("Lymph nodes filter the lymphatic vessels, which helps __________.", "fight infection", "produce both white and red blood cells", "regulate the body’s temperature", "body movement"));
        topics.get(2).addQuestion(new  Question("What type of tissue is found on the inside of the mouth?", "Epithelial", "Muscle", "Nerve", "Connective"));
        topics.get(2).addQuestion(new  Question("What body system stores most of the body’s calcium supply?", "Skeletal", "Respiratory", "Circulatory", "Endocrine"));
        topics.get(2).addQuestion(new  Question("____________ is blood plasma found in the spaces between tissue cells.", "Interstitial fluid", "Cytoplasm", "Lymph", "Nutritive fluid"));
        topics.get(2).addQuestion(new  Question("The basic units of all living things are __________.", "cells", "bacteria", "cytoplasm", "protoplasm"));
        topics.get(2).addQuestion(new  Question("Striated muscles are controlled by __________.", "will", "involuntary actions", "the five senses", "impulses"));
        topics.get(2).addQuestion(new  Question("Which of the following is the process of cell reproduction when the cell divides into two identical cells?", "Mitosis", "Adipose", "Aponeurosis", "Metabolism"));

        topics.get(3).addQuestion(new Question("One of the most prominent characteristics of aged skin is its loss of________.","elasticity","texture","softness","color"));
        topics.get(3).addQuestion(new Question("Which of the following is a form of seborrheic dermatitis?","Dandruff","Eczema","Miliaria rubra","Ivy dermatitis"));
        topics.get(3).addQuestion(new Question("__________ are irregularly shaped dark spots.","Acne","Vesicles","Melanomas","Lesions"));
        topics.get(3).addQuestion(new Question("Which of the following conditions can be life threatening?","Hyperhidrosis","Anhidrosis","Miliaria rubra","Bromhidrosis"));
        topics.get(3).addQuestion(new Question("With what condition is the hair silky white and the eyes pink?","Albinism","Hyperpigmentation","Tan","Nevus"));
        topics.get(3).addQuestion(new Question("The process that causes skin cells to shed begins in which skin layer?","stratum corneum","stratum lucidum","stratum spinosum","Stratum germinativum"));
        topics.get(3).addQuestion(new Question("Any unusual lesions on the skin or on the scalp could be a sign of a ___________.","macule","wheal","skin cancer","vesicle"));
        topics.get(3).addQuestion(new Question("What layer of skin is the deepest layer of the epidermis?","Stratum germinativum","stratum lucidum","stratum granulosum","stratum corneum"));
        topics.get(3).addQuestion(new Question("Lentigines is the technical term for ___________.","a birthmark","a tan","the mask of pregnancy","freckles"));
        topics.get(3).addQuestion(new Question("The outermost layer of the epidermis is covered with a thin layer of sebum, which renders it _________.","elastic","waterproof","firm","rigid"));
        topics.get(3).addQuestion(new Question("Which of the following is commonly referred to as liver spots in older adults?","Lentigines","Chloasma","Nevus","Albinism"));
        topics.get(3).addQuestion(new Question("What body system controls the activity of sweat glands?","Nervous","Endocrine","Lymphatic/immune","Circulatory"));
        topics.get(3).addQuestion(new Question("The most common and least severe skin cancer is_________.","Basal melanoma.","Squamous cell carcinoma.","Malignant melanoma.","Basal cell carcinoma."));
        topics.get(3).addQuestion(new Question("Small, cone-shaped projections of elastic tissue are called ______.","papillae","goose bumps","cutis","melanocytes"));
        topics.get(3).addQuestion(new Question("The color of the skin, whether fair or dark, depends on genetics and _________.","melanin","keratin","collagen","elastin"));
        topics.get(3).addQuestion(new Question("____________ is the absence of pigment, resulting in light or white splotches.","Hypopigmentation","Lentigines","Hyperpigmentation","Nevus"));
        topics.get(3).addQuestion(new Question("Which of the following results in foul-smelling perspiration?","Bromhidrosis","Hyperhidrosis","Anhidrosis","Miliaria rubra"));
        topics.get(3).addQuestion(new Question("Any change in a mole requires____________","medical attention","protection from the sun","removal","exfoliation"));
        topics.get(3).addQuestion(new Question("Processes such as the _________ of sweat cool the body.","stimulation","sensation","evaporation","absorption"));
        topics.get(3).addQuestion(new Question("Grade II acne has_________________.","cysts with comedones","minor breakouts","redness and inflammation","many closed comedones"));
        topics.get(3).addQuestion(new Question("A flat spot or discoloration on the skin is a __________.","macule","cyst","nodule","vesicle"));
        topics.get(3).addQuestion(new Question("One of the appendages of the skin are the___________ glands.","sweat","pituitary","thyroid","thymus"));
        topics.get(3).addQuestion(new Question("The epidermis contains no _________.","blood vessels","keratin","nerve endings","oil"));
        topics.get(3).addQuestion(new Question("A sebaceous cyst is a large, protruding pocket-like lesion filled with _______.","lymph","blood","pus","sebum"));
        topics.get(3).addQuestion(new Question("When sebum becomes hardened and aduct becomes blocked, what is formed?","A blackhead","Wrinkles","A whitehead","Brown-black pigment"));
        topics.get(3).addQuestion(new Question("Which of the following is caused by a virus and is infectious?","Verruca","Mole","Callus","Skin tag"));
        topics.get(3).addQuestion(new Question("The American Cancer Society recommends using the ABCDE Cancer Checklist. What does the “B” stand for?","Border","Blood","Brown","Basal"));
        topics.get(3).addQuestion(new Question("Which of the following occurs when irritating substances temporarily damage the epidermis?","Irritant contact dermatitis","Allergic contact dermatitis","Eczema","Psoriasis"));
        topics.get(3).addQuestion(new Question("What type of skin cancer is characterized by light or pearly nodules?","Basal melanoma.","Squamous cell carcinoma.","Malignant melanoma.","Basal cell carcinoma."));
        topics.get(3).addQuestion(new Question("Blisters and itching develop soon after contact with ___________.","poison oak","chemicals","tints","herpes"));
        topics.get(3).addQuestion(new Question("An open comedo is also known as a(n) _______.","whitehead","blackhead","birthmark","acne"));
        topics.get(3).addQuestion(new Question("Sebum secretion is affected by ______________.","hormones","heat","salt","minor injuries"));
        topics.get(3).addQuestion(new Question("____________is caused by exposure to excessive heat.","Hyperhidrosis","Bromhidrosis","Anhidrosis","Miliaria rubra"));
        topics.get(3).addQuestion(new Question("Large dark hairs often occur in ________.","warts","moles","skin tags","corns"));
        topics.get(3).addQuestion(new Question("An open lesion on the skin or mucous membrane of the body is a(n)________.","crust","fissure","scale","ulcer"));
        topics.get(3).addQuestion(new Question("Which of the following skin layers is responsible for the growth of the epidermis?","stratum germinativum","stratum lucidum","stratum spinosum","stratum corneum"));
        topics.get(3).addQuestion(new Question("The outer layer of the epidermis is the __________.","stratum corneum","stratum granulosum","stratum lucidum","stratum spinosum"));
        topics.get(3).addQuestion(new Question("What type of nerve fibers regulates the excretion of perspiration from the sweat glands?","Secretory","Sensory","Surface","Motor"));
        topics.get(3).addQuestion(new Question("What type of skin cancer has a 90% survival rate with early diagnosis and treatment?","Basal cell carcinoma","Squamous cell carcinoma","Malignant melanoma","Basal melanoma"));
        topics.get(3).addQuestion(new Question("Using sunscreen with an _______ when being in the sun is necessary to reduce the risk of cell and tissue damage.","SPF30","SPF15","SPF25","SPF75"));
        topics.get(3).addQuestion(new Question("The skin responds to heat, cold, touch, pressure, pain, and movement through its ____________nerve endings.","sensory","secretory","motor","autonomic"));
        topics.get(3).addQuestion(new Question("An example of a vesicle is ________.","poison oak","acne","cancer","a wart"));
        topics.get(3).addQuestion(new Question("The sebaceous glands of the skin are connected to the ______.","hair follicles","palms","soles","ducts"));
        topics.get(3).addQuestion(new Question("The mask of pregnancy is also known as _____________.","chloasma","leukoderma","albinism","hypopigmentation"));
        topics.get(3).addQuestion(new Question("The American Cancer Society recommends using the ABCDE Cancer Checklist. What does the “C” stand for?","Color","Character","Cell","Carcinoma"));
        topics.get(3).addQuestion(new Question("Recent research suggests that what disorder is part of an autoimmune disease?","Chloasma","Vitiligo","Tan","Stain"));
        topics.get(3).addQuestion(new Question("Herpes simplex II occurs __________.","on the lips","below the waist","in the nostrils","on the face"));
        topics.get(3).addQuestion(new Question("What is caused by continued, repeated pressure or friction on any part of the skin?","Callus","Mole","Skin tag","Wart"));
        topics.get(3).addQuestion(new Question("Rosacea is a chronic condition that appears primarily _________.","on the cheeks and nose","below the waist","on the scalp","on the back"));
        topics.get(3).addQuestion(new Question("Skin with ________ must be protected from overexposure to the sun.","hyperpigmentation","a nevus","vitiligo","a stain"));
        topics.get(3).addQuestion(new Question("The reticular layer of the dermis contains __________.","hair follicles","tactile corpuscles","melanin","papillae"));
        topics.get(3).addQuestion(new Question("Which of the following are commonly associated with newborn babies?","Closed comedos","Milia","Blackheads","Ruptured follicles"));
        topics.get(3).addQuestion(new Question("Skin tags occur most frequently on the___________.","face","hands and feet","neck and chest","legs and arms"));
        topics.get(3).addQuestion(new Question("The American Cancer Society recommends using the ABCDE Cancer Checklist. What does the “E” stand for?","Evolution","Environment","Examination","Epidermis"));
        topics.get(3).addQuestion(new Question("What type of skin cancer is characterized by black or dark brown patches that may appear uneven in texture, jagged, or raised?","Malignant melanoma.","Basal cell carcinoma.","Squamous cell carcinoma.","Basal cell melanoma."));
        topics.get(3).addQuestion(new Question("What type of cancer is 100% fatal if left untreated?","Malignant melanoma.","Basal cell carcinoma.","Squamous cell carcinoma.","Basal melanoma."));
        topics.get(3).addQuestion(new Question("___________tissue is a layer of fatty tissue found below the dermis.","Adipose","Fibrous","Connective","Elastic"));
        topics.get(3).addQuestion(new Question("Propionibacterium acne occurs when obstructed follicles are deprived of ________.","sebum","blood","oxygen","lymphatic fluid"));
        topics.get(3).addQuestion(new Question("Which of the following might be caused by a burn?","A tan","Leukoderma","A stain","Vitiligo"));
        topics.get(3).addQuestion(new Question("A bulla is a(n) ____________________.","small blister or sac containing clear fluid","abnormal mass varying in size, shape, and color","large blister containing a watery fluid","liver spot"));
        topics.get(3).addQuestion(new Question("A verruca is also known as a ____________.","wart","keratoma","skin tag","mole"));
        topics.get(3).addQuestion(new Question("The American Cancer Society recommends using the ABCDE Cancer Checklist. What does the “D” stand for?","Diameter","Density","Dermatologist","Diagnosis"));
        topics.get(3).addQuestion(new Question("Sores that do not heal could be a sign of _______.","skin cancer","acne","lentigines","nevus"));
        topics.get(3).addQuestion(new Question("The American Cancer Society recommends using the ABCDE Cancer Checklist. What does the “A” stand for?","Asymmetry","Appearance","Aggressiveness","Age"));
        topics.get(3).addQuestion(new Question("What can cause an excoriation?","Scratching","Excessive dandruff","Post-operative repair","Severely chapped hands"));
        topics.get(3).addQuestion(new Question("What causes a wheal?","Poison ivy","Cancer","Impetigo","Mosquito bite"));

        topics.get(4).addQuestion(new Question("What type of hair is the long, coarse hair found on the scalp, legs, and arms?","Terminal","Medulla","Lanugo","Vellus"));
        topics.get(4).addQuestion(new Question("It is normal to lose an average of _________ hairs per day.","75 to 100","25 to 30","100 to 200","10 to 15"));
        topics.get(4).addQuestion(new Question("How long does the telogen phase last?","3 to 6 months","3 to 5 years","1 to 2 weeks","10 years"));
        topics.get(4).addQuestion(new Question("Which of the following is an indication of the strength of the side bonds in the hair?","Elasticity","Porosity","Density","Texture"));
        topics.get(4).addQuestion(new Question("___________ is a characteristic of scabies.","Excessive itching","Cuplike crusts","A boil","Red papules"));
        topics.get(4).addQuestion(new Question("Curly or wavy hair may stretch up to what percentage of its original length?","50 percent","25 percent","100 percent","75 percent"));
        topics.get(4).addQuestion(new Question("Dandruff is the result of a___________.","fungus","viral infection","parasite","bacterial infection"));
        topics.get(4).addQuestion(new Question("What disorder is often seen in men and women of Mediterranean, African, Hispanic, and Jewish ethnicity?","Pseudofolliculitis barbae.","Furuncles.","Sycosis vulgaris.","Folliculitis barbae."));
        topics.get(4).addQuestion(new Question("The average growth rate of healthy hair on the scalp is how many inches per month?","1/2 inch","1 inch","1/4 inch","2 inches"));
        topics.get(4).addQuestion(new Question("Which of the following is the technical term for dandruff?","Pityriasis","Canities","Trichoptilosis","Tinea"));
        topics.get(4).addQuestion(new Question("What type of hair is more susceptible to damage from chemical services?","Fine","Medium","Coarse","Wiry"));
        topics.get(4).addQuestion(new Question("Where are hair follicles not distributed on the body?","Soles of the feet","Fingers","Backs of the hands","Toes"));
        topics.get(4).addQuestion(new Question("Pseudofolliculitis barbae is also known as ___________.","razor bumps","barber’s itch","classic dandruff","ringworm"));
        topics.get(4).addQuestion(new Question("The spiral shape of a coiled protein is called a_______.","helix","polypeptide chain","keratin","trichology"));
        topics.get(4).addQuestion(new Question("What joins two polypeptide strands together?","Cystine","Melanin","End bond","Helix"));
        topics.get(4).addQuestion(new Question("A salt bond is re-formed by ______________.","normalizing Ph","cooling","oxidation with a neutralizer","drying"));
        topics.get(4).addQuestion(new Question("During what hair phase are new cells manufactured in the hair follicle?","Anagen","Catagen","Resting","Telogen"));
        topics.get(4).addQuestion(new Question("Hair texture is measured by the _______of the hair strand.","diameter","weight","color","finish"));
        topics.get(4).addQuestion(new Question("Antidandruff shampoos contain _________ ingredients to help control dandruff.","antifungal","disinfectants","antibiotic","salicylic acid"));
        topics.get(4).addQuestion(new Question("Hair with a high porosity level is usually the result of ___________.","previous overprocessing","poor nutrition","genetics","internal disorders"));
        topics.get(4).addQuestion(new Question("The cuticle layer of the hair is responsible for the ___________of the hair.","shine and silkiness","elasticity","natural color","strength"));
        topics.get(4).addQuestion(new Question("The number of hairs on the head varies with the ______ of the hair.","color","porosity","texture","elasticity"));
        topics.get(4).addQuestion(new Question("Clients who exhibit symptoms of __________ should be referred to a physician.","alopecia areata","alopecia senilis","alopecia prematura","androgenic alopecia"));
        topics.get(4).addQuestion(new Question("________ is the most common permanent hair replacement technique.","Hair transplant","Hair weaves","Topical treatment","Oral prescription medication"));
        topics.get(4).addQuestion(new Question("In men, ___________ is known as male pattern baldness.","androgenic alopecia","alopecia senilis","alopecia universalis","alopecia syphilitica"));
        topics.get(4).addQuestion(new Question("Canities is the technical term for _____.","gray hair","knotted hair","beaded hair","split ends"));
        topics.get(4).addQuestion(new Question("What do salt bonds depend on?","Ph","Heat","Oxidation","Water"));
        topics.get(4).addQuestion(new Question("The only way to remove split ends is_________.","to cut them","hair conditioning","with scalp conditioning","hair oils"));
        topics.get(4).addQuestion(new Question("Hypertrichosis is a condition of _____________.","abnormal growth of hair","brittle hair","split ends","gray hair"));
        topics.get(4).addQuestion(new Question("Head lice can live away from the human body for up to how long?","48 hours","72 hours","1 month","1 week"));
        topics.get(4).addQuestion(new Question("Complete body hair loss is called __________.","alopecia universalis","alopecia areata","alopecia totalis","alopecia senilis"));
        topics.get(4).addQuestion(new Question("What phase determines how long the hair will grow before shedding?","Anagen","Catagen","Resting","Telogen"));
        topics.get(4).addQuestion(new Question("What type of hair has a hard, glassy finish?","Wiry","Fine","Coarse","Medium"));
        topics.get(4).addQuestion(new Question("Barbers may encounter bacterial staphylococci infections in the form of different types of _____________.","folliculitis","malassezia","pityriasis","pediculosis"));
        topics.get(4).addQuestion(new Question("Disulfide bonds broken by hydroxide relaxers __________.","are permanently broken","re-form when the hair cools","re-form when the hair dries","re-form as peptide bonds"));
        topics.get(4).addQuestion(new Question("Hair __________ can be determined by feeling a single strand of dry hair between the fingers.","texture","density","elasticity","porosity"));
        topics.get(4).addQuestion(new Question("What layer of hair may be absent in very fine and naturally blond hair?","Medulla","Cuticle","Cortex","Dermal papilla"));
        topics.get(4).addQuestion(new Question("What percentage of the total weight of the hair comes from the cortex?","90 percent","50 percent","10 percent","75 percent"));
        topics.get(4).addQuestion(new Question("Which glands are attached to each hair follicle?","Sebaceous","Sudoriferous","Thyroid","Pituitary"));
        topics.get(4).addQuestion(new Question("Disulfide bonds are broken by ___________.","chemical relaxers","alkaline solutions","water","heat"));
        topics.get(4).addQuestion(new Question("During which stage of life are the endocrine glands most active?","Adolescence.","Infancy.","Middle age.","Old age."));
        topics.get(4).addQuestion(new Question("Hair is composed chiefly of a fibrous protein called ________.","keratin","melanin","eumelanin","cysteine"));
        topics.get(4).addQuestion(new Question("Which of the following is a tuft of hair that stands straight up?","Cowlick","Natural part","Whorl","Hair stream"));
        topics.get(4).addQuestion(new Question("Hair porosity is the ability of the hair to____________.","absorb moisture","have an odor","stretch","return to its original length without "));
        topics.get(4).addQuestion(new Question("Which scalp condition is characterized by an accumulation of greasy or waxy scales mixed with sebum?","Pityriasis steatoides","Furuncle","Tinea","Pediculosis capitis"));
        topics.get(4).addQuestion(new Question("It is more difficult for hair lighteners, hair colors, and waving solutions to penetrate what type of hair?","Coarse","Medium","Fine","Wiry"));
        topics.get(4).addQuestion(new Question("The average hair density is approximately how many strands per square inch?","2200","75","100","100 000"));
        topics.get(4).addQuestion(new Question("Hydrogen bonds are broken when hair gets ________.","wet","dry","cut","brushed"));
        topics.get(4).addQuestion(new Question("You should not begin any service if___________ are present.","parasites","pityriasis","hypertrophies","fraglitas crinium"));
        topics.get(4).addQuestion(new Question("The changes that take place in the hair during chemical services occur within the _______.","cortex","cuticle","medulla","melanin"));
        topics.get(4).addQuestion(new Question("Products that claim to increase hair growth are regulated as ____________.","drugs","genetic products","cosmetics","natural products"));
        topics.get(4).addQuestion(new Question("The ________ is the outermost layer of the hair.","cuticle","cortex","bulb","medulla"));
        topics.get(4).addQuestion(new Question("Acquired canities develops with ________.","age","ingrown hairs","too much melanin","improper shaving"));
        topics.get(4).addQuestion(new Question("The _________ contains the blood and nerve supply that provides nutrients for hair growth.","dermal papilla","hair shaft","hair bulb","arrector pili"));
        topics.get(4).addQuestion(new Question("If you can feel a slight roughness in the hair, the hair is _________.","porous","brittle","over-porous","resistant"));
        topics.get(4).addQuestion(new Question("_____________ is characterized by the sudden falling out of hair in round patches, which creates bald spots.","Alopecia areata","Alopecia senilis","Androgenic alopecia","Alopecia syphilitica"));
        topics.get(4).addQuestion(new Question("Finasteride is an oral prescription medication for men, sold under the brand name _______.","Propecia","Theroxidil","Rogaine","Minoxidil"));
        topics.get(4).addQuestion(new Question("Hair that breaks easily or fails to return to its normal length has low _________.","elasticity","porosity","Ph","absorption"));
        topics.get(4).addQuestion(new Question("What condition can be worsened by irritation caused by shaving or continual nasal discharge?","Sycosis vulgaris","Tinea favosa","Scabies","Pediculosis capitis"));
        topics.get(4).addQuestion(new Question("A possible side effect of finasteride is ________.","weight gain","increase in sexual function","weight loss","increasing the rate of hair loss"));
        topics.get(4).addQuestion(new Question("Some fine or very fine hair does not possess a ___________.","medulla","cuticle","diameter","cortex"));
        topics.get(4).addQuestion(new Question("The lower part of the hair bulb is hollow and fits over and covers the _______.","dermal papilla","epidermis","dermis","follicle"));
        topics.get(4).addQuestion(new Question("40 percent of men and women show hair loss by age ____.","35","40","18","25"));
        topics.get(4).addQuestion(new Question("Salt bonds are easily broken by __________.","strong acidic solutions","heat","water","mildly acidic solutions"));
        topics.get(4).addQuestion(new Question("All forms of tinea are___________.","highly contagious","permanent","highly unpredictable","the result of genetics"));

        /*topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
        topics.get(5).addQuestion(new Question("","","","",""));
*/


        return topics;
    }
    public int questionsLeft(){
        return questions.size();
    }
    public void shareContext(Context context){
        mContext=context;
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
    public void setTest(String name){
        mPrefs = mContext.getSharedPreferences("MyObject", MODE_PRIVATE);
        if (mPrefs == null){
            initAllTopics();
        }
        Gson gson = new Gson();


        if (!mPrefs.contains(name)){
            initAllTopics();
        }
        String json = mPrefs.getString(name, "error");
        topic = gson.fromJson(json, Topic.class);
        questions = topic.getQuestions();
        if(name.equals(testNames.get(testNames.size()-1))){
            setWrongAnswersMode();
        } else {
            setNormalAnswersMode();
        }
        testName=name;
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
    public ArrayList<String> getTestNames (){
        return testNames;
    }
    public void setTestNumber(int testNumber) {
        this.testNumber = testNumber;
    }
}
