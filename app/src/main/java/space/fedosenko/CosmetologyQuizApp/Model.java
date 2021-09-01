package space.fedosenko.CosmetologyQuizApp;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Random;

import static android.content.ContentValues.TAG;
import static android.content.Context.MODE_PRIVATE;

public class Model {
    private static Model instance;
    private Context mContext;

    private Topic topic;
    private ArrayList<Question> wrongAnswers = new ArrayList<>();
    private boolean failedQuestions = false;
    private int testNumber;
    private String testName;
    private ArrayList<String> testNames;
    private SharedPreferences  mPrefs;
    private ArrayList<Topic> topics;
    private Model() {
        testNames = new ArrayList<>();
        testNames.add("Infection Control");
        testNames.add("Anatomy and Physiology");
        testNames.add("Skin Structure, Disorders, and Disease");
        testNames.add("Properties and Disorders of the Hair");
        testNames.add("Basics of Chemistry");
        testNames.add("Implements, Tools, and Equipment");

        testNames.add("Women's Haircutting and Styling");
        testNames.add("Haircoloring and Lightening");
        testNames.add("Shaving");
        testNames.add("Men's facial");
        testNames.add("General Test");
        testNames.add("Wrong Answers");

    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }


    private ArrayList<Topic> setQuestions() {

        topics = new ArrayList<>();

        for (int i = 0; i < testNames.size(); i++) {
            topics.add(new Topic(testNames.get(i)));
        }

        topics.get(0).addQuestion(new  Question("Barbering tools and implements are designed for specific _____________.", "purposes", "barbers", "environments", "clients"));
        topics.get(0).addQuestion(new  Question("_____________ may contain antirust ingredients.", "Quat solutions", "Phenol", "Petroleum distillates", "Bleach"));
        topics.get(0).addQuestion(new  Question("Never mix ___________ together under any circumstances.", "cleaning products", "sawdust and chemicals", "water and shaving cream", "shampoos"));
        topics.get(0).addQuestion(new  Question("Clothing should be___________.", "comfortable", "excessively baggy", "loose", "tight"));
        topics.get(0).addQuestion(new  Question("_________ is a mechanical process (scrubbing) using soap and water or detergent and water.", "Cleaning", "Sanitizing", "Disinfection", "Sterilization"));
        topics.get(0).addQuestion(new  Question("Tuberculocidal disinfectants are often referred to as_________.", "phenolics", "wet sanitizers", "quats", "statutes"));
        topics.get(0).addQuestion(new  Question("Which of the following is the most powerful and important way to prevent the spread of infection?", "Handwashing.", "Use of heat.", "Use of an autoclave.", "Use of EPA-registered disinfectant."));
        topics.get(0).addQuestion(new  Question("Where should you test the water temperature before applying to a client’s hair or scalp?", "Inside of your wrist.", "Back of your hand.", "Palm of your hand.", "Your fingers."));
        topics.get(0).addQuestion(new  Question("Water heaters should not be set at higher than what temperature?", "130 degrees Fahrenheit.", "200 degrees Fahrenheit.", "175 degrees Fahrenheit.", "150 degrees Fahrenheit."));
        topics.get(0).addQuestion(new  Question("Which of the following does not spread the HIV virus?", "Sharing food.", "Sharing of needles.", "Contact with cuts and sores.", "Unprotected sexual contact."));
        topics.get(0).addQuestion(new  Question("Disinfectants must be registered with the ___________.", "EPA", "OSHA", "SDS", "HCS"));
        topics.get(0).addQuestion(new  Question("The majority of contaminants and pathogens can be removed from the surfaces of tools and implements through proper __________.", "cleaning", "mixing of disinfectants", "handwashing", "guidelines"));
        topics.get(0).addQuestion(new  Question("If you spill water while working at the shampoo bowl, you should __________.", "clean it up immediately", "let it dry on its own", "ask someone nearby to clean it up", "clean it up after the client leaves"));
        topics.get(0).addQuestion(new  Question("Lyme disease is caused by what type of bacteria?", "Spirilla.", "Bacilli.", "Diplococci.", "Staphylococci."));
        topics.get(0).addQuestion(new  Question("Which bacteria cause MRSA?", "Staphylococci.", "Spirilla.", "Streptococci.", "Diplococci."));
        topics.get(0).addQuestion(new  Question("What disease breaks down the body’s immune system?", "AIDS.", "MRSA.", "Hepatitis A.", "Hepatitis C."));
        topics.get(0).addQuestion(new  Question("__________ that stems from a knowledgeable and caring manner is what separates a true professional from a nonprofessional.", "Behavior", "Income", "Clothing", "Legal responsibility"));
        topics.get(0).addQuestion(new  Question("Laws are also called ___________.", "statutes", "regulations", "rules", "guidelines"));
        topics.get(0).addQuestion(new  Question("What should you use to cushion the client’s neck at the shampoo bowl?", "Folded towel.", "Neck strip.", "Cape.", "Pillow."));
        topics.get(0).addQuestion(new  Question("The EPA registers all types of __________ sold and used in the United States.", "disinfectants", "bacteria", "fungi", "viruses"));
        topics.get(0).addQuestion(new  Question("Due to the drying effect of alcohol, hand sanitizers should not be _________.", "overused", "cleaners", "diluted", "used as an antiseptic"));
        topics.get(0).addQuestion(new  Question("What type of disinfectant is a form of formaldehyde?", "Phenolics.", "Petroleum distillates.", "Bleach.", "Quaternary ammonium compounds."));
        topics.get(0).addQuestion(new  Question("It is your legal responsibility to keep your ____________ current.", "license", "clients", "shoes", "jewelry"));
        topics.get(0).addQuestion(new  Question("The body prevents and controls infections through__________.", "uncompromised skin", "weakened tissue", "broken skin", "unprotected sex"));
        topics.get(0).addQuestion(new  Question("It is the barber's responsibility to _________.", "be aware of changes to rules and regulations", "recommend changes to rules and regulations", "keep regulatory agencies informed about changes to regulations", "decide what constitutes legal standards of conduct"));
        topics.get(0).addQuestion(new  Question("Where are disinfecting jars usually placed?", "On the station countertop.", "Under a cabinet.", "On a shelf.", "Attached to a wall."));
        topics.get(0).addQuestion(new  Question("__________is the process that destroys all microbial life, including spores.", "Sterilization", "Sanitizing", "Cleaning", "Disinfection"));
        topics.get(0).addQuestion(new  Question("The CDC requires that autoclaves be tested weekly to ensure they are properly sterilizing implements, using a _________test.", "spore", "performance", "bacterial", "viral"));
        topics.get(0).addQuestion(new  Question("Do not allow children to play ___________.", "on the hydraulic chairs", "on the waiting room chairs", "on the floor", "in the reception area"));
        topics.get(0).addQuestion(new  Question("Effective sterilization typically requires the use of a(n)_________.", "autoclave", "multiuse tool", "hospital disinfectant", "UV light unit"));
        topics.get(0).addQuestion(new  Question("On a Safety Data Sheet, toxicology information would include which of the following?", "Routes of exposure.", "Chemical stability.", "Disposal techniques.", "Chemical characteristics."));
        topics.get(0).addQuestion(new  Question("Never take ___________ for cleaning and disinfecting.", "shortcuts", "more than a few minutes", "legal responsibility", "preventative measures"));
        topics.get(0).addQuestion(new  Question("Never overload electrical outlets or use ____________.", "extension cords", "electric latherizers", "GFCI outlets", "electrical cords"));
        topics.get(0).addQuestion(new  Question("OSHA was created as part of the ___________.", "U.S. Department of Labor", "United Nations", "state barber boards", "EPA"));
        topics.get(0).addQuestion(new  Question("When cutting a child’s hair, try to anticipate the child’s __________.", "sudden moves", "moods", "inquisitive nature", "hairstyle choice"));
        topics.get(0).addQuestion(new  Question("Alcohol should only be used as a cleaner or ____________.", "antiseptic", "sterilizer", "disinfectant", "bleach"));
        topics.get(0).addQuestion(new  Question("What type of disinfectant is similar in chemical structure to kerosene?", "Petroleum distillates", "Phenolic disinfectants", "Bleach", "Quats"));
        topics.get(0).addQuestion(new  Question("Who should be instructed in fire extinguisher use?", "All employees.", "The clients.", "Only the receptionist.", "Only the barbers."));
        topics.get(0).addQuestion(new  Question("__________ should not be used to disinfect or sterilize implements.", "Baby sterilizers", "Disinfectant containers", "Bleach", "Autoclaves"));
        topics.get(0).addQuestion(new  Question("It is important to wear __________ and gloves while disinfecting nonelectrical tools.", "safety glasses", "a cape", "earplugs", "an apron"));
        topics.get(0).addQuestion(new  Question("Cocci are generally transmitted in ___________.", "the air", "semen", "spores", "water"));
        topics.get(0).addQuestion(new  Question("The second step of infection control is __________.", "disinfection", "cleaning", "sterilization", "sanitation"));
        topics.get(0).addQuestion(new  Question("When a disease spreads from one person to another, the disease is said to be a(n)_______.", "contagious disease", "inflammation", "systemic infection", "local infection"));
        topics.get(0).addQuestion(new  Question("Disinfection is not effective against ___________.", "bacterial spores", "mold", "fungi", "viruses"));
        topics.get(0).addQuestion(new  Question("Staphylococci grow in what shape?", "Clusters, like bunches of grapes.", "Rod.", "Corkscrew.", "Pairs."));
        topics.get(0).addQuestion(new  Question("An autoclave is a piece of equipment that incorporates heat and________.", "pressure", "quaternary ammonium compounds", "phenolics", "chemicals"));
        topics.get(0).addQuestion(new  Question("Every solution, liquid, cream, powder, paste, gel, and other substance should be properly ___________.", "labeled", "cleaned", "disinfected", "diluted"));
        topics.get(0).addQuestion(new  Question("An EPA registration number certifies that a disinfectant _____________.", "is effective against the pathogens listed on the label", "has an appropriate water content for commercial use", "does not need to be mixed prior to application", "will destroy all known pathogens"));
        topics.get(0).addQuestion(new  Question("Hydrogen peroxide works well as an antiseptic at what percentage of strength?", "3 percent.", "5 percent.", "25 percent.", "10 percent."));
        topics.get(0).addQuestion(new  Question("The invasion of body tissues by disease-causing pathogens is called a(n)______.", "infection", "toxin", "immunity", "disease"));
        topics.get(0).addQuestion(new  Question("Hepatitis can live on a surface outside the body for__________.", "long periods of time", "only the contact time", "short periods of time", "approximately 10 minutes"));
        topics.get(0).addQuestion(new  Question("What bloodborne virus can damage the liver?", "Hepatitis.", "HIV.", "AIDS.", "MRSA."));
        topics.get(0).addQuestion(new  Question("State regulatory agencies include ___________.", "the EPA", "OSHA", "hospitals", "health departments"));
        topics.get(0).addQuestion(new  Question("If you accidentally cut a client, what should you do first?", "Stop the service immediately.", "Wash your hands.", "Calmly apologize.", "Apply slight pressure to the area."));
        topics.get(0).addQuestion(new  Question("You should never mix __________.", "detergents and bleach", "detergents and water", "bleach and water", "concentrated disinfectants and water"));
        topics.get(0).addQuestion(new  Question("State agencies regulate____________.", "licensing", "chemical ingredients", "use of equipment", "manufacturing of equipment"));
        topics.get(0).addQuestion(new  Question("Disinfectants are a type of ___________.", "poison", "nutrient", "residue", "immunity"));
        topics.get(0).addQuestion(new  Question("Fumes from chemical applications and nail care products require filtration units that cleanse and ____________ the air.", "detoxify", "disinfect", "cool", "heat"));
        topics.get(0).addQuestion(new  Question("Do not try to________ tools yourself.", "repair", "purchase", "disinfect", "clean"));
        topics.get(0).addQuestion(new  Question("Rings should not be worn on the _________,as they might interfere with haircutting accuracy.", "index fingers", "pinky fingers", "thumbs", "ring fingers"));
        topics.get(0).addQuestion(new  Question("In the barbershop, the spread of bloodborne pathogens is possible during _________.", "haircutting", "brushing", "shampooing", "blowdrying"));
        topics.get(0).addQuestion(new  Question("What type of hepatitis is the most difficult to kill on a surface?", "Hepatitis B.", "Hepatitis A.", "Hepatitis C.", "Hepatitis E."));
        topics.get(0).addQuestion(new  Question("Fire extinguishers should be placed where they are________.", "readily accessible", "away from clients", "locked in a safe place", "near ventilation"));
        topics.get(0).addQuestion(new  Question("How long should an item remain submerged in the disinfectant?", "10 minutes.", "20 minutes.", "60 minutes.", "2 minutes."));
        topics.get(0).addQuestion(new  Question("Bacteria with flagella move in what type of motion?", "Snakelike.", "Rowing-like.", "Vertical.", "Sudden."));
        topics.get(0).addQuestion(new  Question("Disinfectants can be safely applied to __________.", "non-porous surfaces", "nails", "skin", "hair"));
        topics.get(0).addQuestion(new  Question("You should be prepared for ____________.", "emergencies", "unattended children", "tool repair", "non-professionalism"));
        topics.get(0).addQuestion(new  Question("Staphylococci cause which of the following?", "Boils.", "Blood poisoning.", "Tetanus.", "Pneumonia."));
        topics.get(0).addQuestion(new  Question("Which of the following is an example of a bloodborne virus?", "HIV.", "Cystic fibrosis.", "Otitis media.", "Conjunctivitis."));
        topics.get(0).addQuestion(new  Question("When cutting a child’s hair, hold the child’s head ___________.", "gently but firmly", "at the nape of the neck", "loosely", "with force"));
        topics.get(0).addQuestion(new  Question("Petroleum distillates are excellent at removing __________ from metals.", "oils", "spores", "discoloration", "scratches"));
        topics.get(0).addQuestion(new  Question("Assist clients (especially ________) in and out of hydraulic and shampoo chairs.", "the elderly", "men", "teenagers", "women"));
        topics.get(0).addQuestion(new  Question("Which of the following can grow in bar soaps?", "Bacteria.", "Mold.", "Fungi.", "Viruses."));
        topics.get(0).addQuestion(new  Question("Bacteria multiply best in what type of places?", "Warm.", "Cold.", "Dry.", "Clean."));
        topics.get(0).addQuestion(new  Question("When working at the shampoo bowl, you should avoid __________.", "twisting your waist", "holding your shoulders level", "balancing your neck over your shoulders", "keeping your back straight"));
        topics.get(0).addQuestion(new  Question("Federal and state laws require that manufacturers supply a Safety Data Sheet for all ________ products manufactured and sold.", "chemical", "mechanical", "commercial", "electrical"));
        topics.get(0).addQuestion(new  Question("Keep hair pulled back or short enough to avoid ____________.", "entanglements", "skin irritations", "getting wet", "dirt buildup"));
        topics.get(0).addQuestion(new  Question("Bleach solution should be stored ____________.", "away from heat and light", "away from other solutions", "somewhere damp", "near heat and light"));
        topics.get(0).addQuestion(new  Question("Phenolics are known _________.", "carcinogens", "pathogens", "contaminants", "allergens"));
        topics.get(0).addQuestion(new  Question("_________ is the ability to produce the intended effect.", "Efficacy", "Concentration", "Contact time", "Accuracy"));
        topics.get(0).addQuestion(new  Question("__________are used only for storage of disinfected items.", "UV light units", "Workstations", "Store rooms", "Reception areas"));
        topics.get(0).addQuestion(new  Question("What should you wear when pouring or mixing products?", "Goggles.", "Apron.", "White coat.", "Nonskid shoes."));
        topics.get(0).addQuestion(new  Question("Your most important responsibility is to _____________.", "protect your clients’ health and safety", "recommend products", "know a chemical’s characteristics", "know federal and state manufacturing laws"));
        topics.get(0).addQuestion(new  Question("___________ will not disinfect or sterilize implements.", "UV light units", "Bleach", "Phenolics", "Autoclaves"));
        topics.get(0).addQuestion(new  Question("A(n)________is contact with nonintact skin, blood, body fluid, or other potentially infectious materials.", "exposure incident", "communicable incident", "precautionary incident", "accident"));
        topics.get(0).addQuestion(new  Question("If a tool or implement is dropped on the floor during a service, it must be replaced with a ___________tool.", "disinfected", "cleaned", "sterilized", "contaminated"));
        topics.get(0).addQuestion(new  Question("Never place any tool or implement in your ___________.", "pocket", "workstation", "countertop receptacles", "disinfecting jar"));
        topics.get(0).addQuestion(new  Question("Blood may carry dangerous _________, so you should never touch an open sore or a wound.", "pathogens", "nonpathogens", "allergens", "nutrients"));
        topics.get(0).addQuestion(new  Question("Strict __________ practices should be used with all clients.", "infection control", "emergency", "surgical", "first-aid"));
        topics.get(0).addQuestion(new  Question("Showing no symptoms or signs of infection is considered being _________.", "asymptomatic", "communicable", "contagious", "symptomatic"));
        topics.get(0).addQuestion(new  Question("The presence of _________ is a sign of a bacterial infection.", "pus", "spores", "blood", "oiliness"));

        topics.get(1).addQuestion(new  Question("What scalp muscle causes wrinkles across the forehead?", "Frontalis", "Epicranius", "Epicranial aponeurosis", "Occipitalis"));
        topics.get(1).addQuestion(new  Question("What muscle in the chest assists with breathing?", "Serratus anterior", "Pectoralis minor", "Bicep", "Pectoralis major"));
        topics.get(1).addQuestion(new  Question("What nervous system in the body includes the brain?", "Central nervous system.", "Autonomic nervous system.", "Somatic nervous system.", "Peripheral nervous system."));
        topics.get(1).addQuestion(new  Question("An example of an endocrine gland would be a(n) __________ gland.", "pituitary", "sweat", "oil", "duct"));
        topics.get(1).addQuestion(new  Question("An example of connective tissue would be__________.", "lymph", "neurons", "glands", "the lining of the heart"));
        topics.get(1).addQuestion(new  Question("The word ending -ology means ___________.", "“study of”", "“part of”", "“science of”", "“map of”"));
        topics.get(1).addQuestion(new  Question("Where do the cervical or spinal nerves originate?", "Spinal cord", "Brain", "Vertebrae", "Spinal column"));
        topics.get(1).addQuestion(new  Question("What type of glands release hormonal secretions directly into the bloodstream?", "Endocrine", "Oil", "Exocrine", "Duct"));
        topics.get(1).addQuestion(new  Question("What color is blood in the veins?", "Dark red", "Light pink", "Bright red", "Dark pink"));
        topics.get(1).addQuestion(new  Question("What artery supplies blood to the forehead?", "Frontal", "Transverse facial", "Middle temporal", "Submental"));
        topics.get(1).addQuestion(new  Question("The cell membrane is the cell wall that encloses the ________.", "protoplasm", "yolk", "cytoplasm", "nucleus"));
        topics.get(1).addQuestion(new  Question("What body system destroys disease-causing microorganisms?", "Lymphatic/immune", "Integumentary", "Excretory", "Circulatory"));
        topics.get(1).addQuestion(new  Question("What part of a cell is needed for growth, reproduction, and self-repair?", "The cytoplasm.", "The nucleus.", "The cell membrane.", "The protoplasm."));
        topics.get(1).addQuestion(new  Question("What hormone is primarily present in females?", "Estrogen", "Insulin", "Adrenaline", "Testosterone"));
        topics.get(1).addQuestion(new  Question("The ________ system helps to regulate the body’s temperature.", "integumentary", "circulatory", "muscular", "endocrine"));
        topics.get(1).addQuestion(new  Question("How many bones are in the body?", "206", "230", "140", "120"));
        topics.get(1).addQuestion(new  Question("An oval, bony case that protects the brain is the _________.", "cranium", "maxillae", "thorax", "mandible"));
        topics.get(1).addQuestion(new  Question("Which of the following bring nutrients to the cells and carry away waste materials?", "Capillaries", "Venules", "Arterioles", "Arteries"));
        topics.get(1).addQuestion(new  Question("In the hand, ____________ draw the fingers together.", "adductors", "abductors", "extensors", "pronators"));
        topics.get(1).addQuestion(new  Question("The muscular system functions to_____________.", "help produce movement within the body", "carry impulses from the central nervous system", "transport blood to and from the heart", "help produce both white and red blood cells"));
        topics.get(1).addQuestion(new  Question("What U-shaped bone(s) is located at the base of tongue?", "Hyoid", "Phalanges", "Thorax", "Zygomatic"));
        topics.get(1).addQuestion(new  Question("Which of the following helps carry wastes and impurities away from the cells before it is routed back to the circulatory system?", "Lymph", "Blood", "Interstitial fluid", "Water"));
        topics.get(1).addQuestion(new  Question("A normal adult heart beats about how many times per minute?", "60 to 80", "100 to 110", "90 to 120", "40 to 50"));
        topics.get(1).addQuestion(new  Question("What is the largest organ of the body?", "the skin", "the lungs", "the heart", "the brain"));
        topics.get(1).addQuestion(new  Question("What muscle would you be using if you were grinning?", "Risorius", "Depressor labii inferioris", "Zygomaticus major", "Levator labii superioris"));
        topics.get(1).addQuestion(new  Question("Reflexes do not have to be learned because they are _________.", "automatic", "superficial", "voluntary", "permanent"));
        topics.get(1).addQuestion(new  Question("What does the word integument mean?", "Natural covering", "Map", "Bone", "Study of"));
        topics.get(1).addQuestion(new  Question("What body system provides a suitable fluid environment for the cells?", "Lymphatic/immune", "Circulatory", "Integumentary", "Endocrine"));
        topics.get(1).addQuestion(new  Question("Facial hair growth and color is a result of_____________.", "changing or fluctuating hormones", "a lack of immunities", "inflammation of the tissue", "body temperature"));
        topics.get(1).addQuestion(new  Question("One of the functions of bone marrow is to produce_________.", "white and red blood cells", "hormones", "minerals", "movement within the body"));
        topics.get(1).addQuestion(new  Question("Motor nerves carry impulses from the brain to the _________.", "muscles", "skin", "brain", "nose"));
        topics.get(1).addQuestion(new  Question("An example of a hormone is __________.", "estrogen", "blood", "oil", "sweat"));
        topics.get(1).addQuestion(new  Question("What artery supplies blood to the brain?", "Internal carotid", "External carotid", "Submental", "Facial"));
        topics.get(1).addQuestion(new  Question("A(n) ___________ is the primary structural unit of the nervous system.", "neuron", "axon", "dendrite", "axon terminal"));
        topics.get(1).addQuestion(new  Question("Which of the following is the largest and most complex organization of nerve tissue?", "Brain.", "Cranial nerves.", "Spinal nerves.", "Spinal cord."));
        topics.get(1).addQuestion(new  Question("Which of the following is the chief sensory nerve of the face?", "Trifacial nerve.", "Mental nerve.", "Mandibular nerve.", "Maxillary nerve."));
        topics.get(1).addQuestion(new  Question("What type of tissue is bone composed of?", "Connective", "Nerve", "Muscle", "Epithelial"));
        topics.get(1).addQuestion(new  Question("The seventh cranial nerve is also known as the_______nerve.", "facial", "trigeminal", "accessory", "trifacial"));
        topics.get(1).addQuestion(new  Question("__________ are thick-walled, muscular, flexible tubes.", "Arteries", "Venules", "Arterioles", "Capillaries"));
        topics.get(1).addQuestion(new  Question("________ tissue is a technical term for fat.", "Adipose", "Nerve", "Epithelial", "Muscle"));
        topics.get(1).addQuestion(new  Question("Which of the following is the largest bone of the arm?", "Humerus", "Ulna", "Carpus", "Radius"));
        topics.get(1).addQuestion(new  Question("The ______ bone joins all of the bones of the cranium together.", "sphenoid", "frontal", "ethmoid", "zygomatic"));
        topics.get(1).addQuestion(new  Question("The orbicularis oculi muscle_______________.", "enables you to close your eyes", "can easily be damaged during makeup application", "wrinkles the forehead vertically", "draws the eyebrows down"));
        topics.get(1).addQuestion(new  Question("What body system controls and coordinates the functions of all the other systems?", "Nervous", "Muscular", "Circulatory", "Endocrine"));
        topics.get(1).addQuestion(new  Question("A _______ is the connection between two or more bones of the skeleton.", "joint", "ligament", "tendon", "muscle"));
        topics.get(1).addQuestion(new  Question("One of the functions of the lymphatic/immune system is to__________.", "act as a defense against toxins and bacteria", "pass on the genetic code", "stimulate functional activity", "supply oxygen and eliminate carbon dioxide"));
        topics.get(1).addQuestion(new  Question("The lymphatic/immune system is closely connected to what other body system?", "Cardiovascular", "Nervous", "Reproductive", "Endocrine"));
        topics.get(1).addQuestion(new  Question("The largest artery in the body is the _______.", "aorta", "temporal", "carotid", "facial"));
        topics.get(1).addQuestion(new  Question("The middle part of a muscle is called the____________.", "belly", "nuclei", "origin", "insertion"));
        topics.get(1).addQuestion(new  Question("_________ is the science of the structure of organisms or of their parts.", "Anatomy", "Osteology", "Physiology", "Histology"));
        topics.get(1).addQuestion(new  Question("__________ is the study of the structure, functioning, and diseases of the muscles.", "Myology", "Histology", "Physiology", "Osteology"));
        topics.get(1).addQuestion(new  Question("Keeping the wrist in what position will help to prevent injuries?", "Straight", "Locked", "Bent", "Flexed"));
        topics.get(1).addQuestion(new  Question("What percentage of blood is water?", "80 percent", "50 percent", "25 percent", "63 percent"));
        topics.get(1).addQuestion(new  Question("The muscular system comprises what percentage of the body’s weight?", "40 to 50 percent", "80 percent", "25 percent", "15 to 20 percent"));
        topics.get(1).addQuestion(new  Question("What type of muscle is not duplicated anywhere else in the body?", "Cardiac", "Nonstriated", "Voluntary", "Smooth"));
        topics.get(1).addQuestion(new  Question("Nonstriated muscles are found where in the body?", "Intestines", "Hands", "Face", "Heart"));
        topics.get(1).addQuestion(new  Question("The _____________ circulation system takes deoxygenated blood to the lungs for oxygenation and waste removal and then returns that blood to the heart.", "pulmonary", "general", "cardiovascular", "systemic"));
        topics.get(1).addQuestion(new  Question("Lymph nodes filter the lymphatic vessels, which helps __________.", "fight infection", "produce both white and red blood cells", "regulate the body’s temperature", "body movement"));
        topics.get(1).addQuestion(new  Question("What type of tissue is found on the inside of the mouth?", "Epithelial", "Muscle", "Nerve", "Connective"));
        topics.get(1).addQuestion(new  Question("What body system stores most of the body’s calcium supply?", "Skeletal", "Respiratory", "Circulatory", "Endocrine"));
        topics.get(1).addQuestion(new  Question("____________ is blood plasma found in the spaces between tissue cells.", "Interstitial fluid", "Cytoplasm", "Lymph", "Nutritive fluid"));
        topics.get(1).addQuestion(new  Question("The basic units of all living things are __________.", "cells", "bacteria", "cytoplasm", "protoplasm"));
        topics.get(1).addQuestion(new  Question("Striated muscles are controlled by __________.", "will", "involuntary actions", "the five senses", "impulses"));
        topics.get(1).addQuestion(new  Question("Which of the following is the process of cell reproduction when the cell divides into two identical cells?", "Mitosis", "Adipose", "Aponeurosis", "Metabolism"));

        topics.get(2).addQuestion(new Question("One of the most prominent characteristics of aged skin is its loss of________.","elasticity","texture","softness","color"));
        topics.get(2).addQuestion(new Question("Which of the following is a form of seborrheic dermatitis?","Dandruff","Eczema","Miliaria rubra","Ivy dermatitis"));
        topics.get(2).addQuestion(new Question("__________ are irregularly shaped dark spots.","Acne","Vesicles","Melanomas","Lesions"));
        topics.get(2).addQuestion(new Question("Which of the following conditions can be life threatening?","Hyperhidrosis","Anhidrosis","Miliaria rubra","Bromhidrosis"));
        topics.get(2).addQuestion(new Question("With what condition is the hair silky white and the eyes pink?","Albinism","Hyperpigmentation","Tan","Nevus"));
        topics.get(2).addQuestion(new Question("The process that causes skin cells to shed begins in which skin layer?","stratum corneum","stratum lucidum","stratum spinosum","Stratum germinativum"));
        topics.get(2).addQuestion(new Question("Any unusual lesions on the skin or on the scalp could be a sign of a ___________.","macule","wheal","skin cancer","vesicle"));
        topics.get(2).addQuestion(new Question("What layer of skin is the deepest layer of the epidermis?","Stratum germinativum","stratum lucidum","stratum granulosum","stratum corneum"));
        topics.get(2).addQuestion(new Question("Lentigines is the technical term for ___________.","a birthmark","a tan","the mask of pregnancy","freckles"));
        topics.get(2).addQuestion(new Question("The outermost layer of the epidermis is covered with a thin layer of sebum, which renders it _________.","elastic","waterproof","firm","rigid"));
        topics.get(2).addQuestion(new Question("Which of the following is commonly referred to as liver spots in older adults?","Lentigines","Chloasma","Nevus","Albinism"));
        topics.get(2).addQuestion(new Question("What body system controls the activity of sweat glands?","Nervous","Endocrine","Lymphatic/immune","Circulatory"));
        topics.get(2).addQuestion(new Question("The most common and least severe skin cancer is_________.","Basal melanoma.","Squamous cell carcinoma.","Malignant melanoma.","Basal cell carcinoma."));
        topics.get(2).addQuestion(new Question("Small, cone-shaped projections of elastic tissue are called ______.","papillae","goose bumps","cutis","melanocytes"));
        topics.get(2).addQuestion(new Question("The color of the skin, whether fair or dark, depends on genetics and _________.","melanin","keratin","collagen","elastin"));
        topics.get(2).addQuestion(new Question("____________ is the absence of pigment, resulting in light or white splotches.","Hypopigmentation","Lentigines","Hyperpigmentation","Nevus"));
        topics.get(2).addQuestion(new Question("Which of the following results in foul-smelling perspiration?","Bromhidrosis","Hyperhidrosis","Anhidrosis","Miliaria rubra"));
        topics.get(2).addQuestion(new Question("Any change in a mole requires____________","medical attention","protection from the sun","removal","exfoliation"));
        topics.get(2).addQuestion(new Question("Processes such as the _________ of sweat cool the body.","stimulation","sensation","evaporation","absorption"));
        topics.get(2).addQuestion(new Question("Grade II acne has_________________.","cysts with comedones","minor breakouts","redness and inflammation","many closed comedones"));
        topics.get(2).addQuestion(new Question("A flat spot or discoloration on the skin is a __________.","macule","cyst","nodule","vesicle"));
        topics.get(2).addQuestion(new Question("One of the appendages of the skin are the___________ glands.","sweat","pituitary","thyroid","thymus"));
        topics.get(2).addQuestion(new Question("The epidermis contains no _________.","blood vessels","keratin","nerve endings","oil"));
        topics.get(2).addQuestion(new Question("A sebaceous cyst is a large, protruding pocket-like lesion filled with _______.","lymph","blood","pus","sebum"));
        topics.get(2).addQuestion(new Question("When sebum becomes hardened and aduct becomes blocked, what is formed?","A blackhead","Wrinkles","A whitehead","Brown-black pigment"));
        topics.get(2).addQuestion(new Question("Which of the following is caused by a virus and is infectious?","Verruca","Mole","Callus","Skin tag"));
        topics.get(2).addQuestion(new Question("The American Cancer Society recommends using the ABCDE Cancer Checklist. What does the “B” stand for?","Border","Blood","Brown","Basal"));
        topics.get(2).addQuestion(new Question("Which of the following occurs when irritating substances temporarily damage the epidermis?","Irritant contact dermatitis","Allergic contact dermatitis","Eczema","Psoriasis"));
        topics.get(2).addQuestion(new Question("What type of skin cancer is characterized by light or pearly nodules?","Basal melanoma.","Squamous cell carcinoma.","Malignant melanoma.","Basal cell carcinoma."));
        topics.get(2).addQuestion(new Question("Blisters and itching develop soon after contact with ___________.","poison oak","chemicals","tints","herpes"));
        topics.get(2).addQuestion(new Question("An open comedo is also known as a(n) _______.","whitehead","blackhead","birthmark","acne"));
        topics.get(2).addQuestion(new Question("Sebum secretion is affected by ______________.","hormones","heat","salt","minor injuries"));
        topics.get(2).addQuestion(new Question("____________is caused by exposure to excessive heat.","Hyperhidrosis","Bromhidrosis","Anhidrosis","Miliaria rubra"));
        topics.get(2).addQuestion(new Question("Large dark hairs often occur in ________.","warts","moles","skin tags","corns"));
        topics.get(2).addQuestion(new Question("An open lesion on the skin or mucous membrane of the body is a(n)________.","crust","fissure","scale","ulcer"));
        topics.get(2).addQuestion(new Question("Which of the following skin layers is responsible for the growth of the epidermis?","stratum germinativum","stratum lucidum","stratum spinosum","stratum corneum"));
        topics.get(2).addQuestion(new Question("The outer layer of the epidermis is the __________.","stratum corneum","stratum granulosum","stratum lucidum","stratum spinosum"));
        topics.get(2).addQuestion(new Question("What type of nerve fibers regulates the excretion of perspiration from the sweat glands?","Secretory","Sensory","Surface","Motor"));
        topics.get(2).addQuestion(new Question("What type of skin cancer has a 90% survival rate with early diagnosis and treatment?","Basal cell carcinoma","Squamous cell carcinoma","Malignant melanoma","Basal melanoma"));
        topics.get(2).addQuestion(new Question("Using sunscreen with an _______ when being in the sun is necessary to reduce the risk of cell and tissue damage.","SPF30","SPF15","SPF25","SPF75"));
        topics.get(2).addQuestion(new Question("The skin responds to heat, cold, touch, pressure, pain, and movement through its ____________nerve endings.","sensory","secretory","motor","autonomic"));
        topics.get(2).addQuestion(new Question("An example of a vesicle is ________.","poison oak","acne","cancer","a wart"));
        topics.get(2).addQuestion(new Question("The sebaceous glands of the skin are connected to the ______.","hair follicles","palms","soles","ducts"));
        topics.get(2).addQuestion(new Question("The mask of pregnancy is also known as _____________.","chloasma","leukoderma","albinism","hypopigmentation"));
        topics.get(2).addQuestion(new Question("The American Cancer Society recommends using the ABCDE Cancer Checklist. What does the “C” stand for?","Color","Character","Cell","Carcinoma"));
        topics.get(2).addQuestion(new Question("Recent research suggests that what disorder is part of an autoimmune disease?","Chloasma","Vitiligo","Tan","Stain"));
        topics.get(2).addQuestion(new Question("Herpes simplex II occurs __________.","on the lips","below the waist","in the nostrils","on the face"));
        topics.get(2).addQuestion(new Question("What is caused by continued, repeated pressure or friction on any part of the skin?","Callus","Mole","Skin tag","Wart"));
        topics.get(2).addQuestion(new Question("Rosacea is a chronic condition that appears primarily _________.","on the cheeks and nose","below the waist","on the scalp","on the back"));
        topics.get(2).addQuestion(new Question("Skin with ________ must be protected from overexposure to the sun.","hyperpigmentation","a nevus","vitiligo","a stain"));
        topics.get(2).addQuestion(new Question("The reticular layer of the dermis contains __________.","hair follicles","tactile corpuscles","melanin","papillae"));
        topics.get(2).addQuestion(new Question("Which of the following are commonly associated with newborn babies?","Closed comedos","Milia","Blackheads","Ruptured follicles"));
        topics.get(2).addQuestion(new Question("Skin tags occur most frequently on the___________.","face","hands and feet","neck and chest","legs and arms"));
        topics.get(2).addQuestion(new Question("The American Cancer Society recommends using the ABCDE Cancer Checklist. What does the “E” stand for?","Evolution","Environment","Examination","Epidermis"));
        topics.get(2).addQuestion(new Question("What type of skin cancer is characterized by black or dark brown patches that may appear uneven in texture, jagged, or raised?","Malignant melanoma.","Basal cell carcinoma.","Squamous cell carcinoma.","Basal cell melanoma."));
        topics.get(2).addQuestion(new Question("What type of cancer is 100% fatal if left untreated?","Malignant melanoma.","Basal cell carcinoma.","Squamous cell carcinoma.","Basal melanoma."));
        topics.get(2).addQuestion(new Question("___________tissue is a layer of fatty tissue found below the dermis.","Adipose","Fibrous","Connective","Elastic"));
        topics.get(2).addQuestion(new Question("Propionibacterium acne occurs when obstructed follicles are deprived of ________.","sebum","blood","oxygen","lymphatic fluid"));
        topics.get(2).addQuestion(new Question("Which of the following might be caused by a burn?","A tan","Leukoderma","A stain","Vitiligo"));
        topics.get(2).addQuestion(new Question("A bulla is a(n) ____________________.","small blister or sac containing clear fluid","abnormal mass varying in size, shape, and color","large blister containing a watery fluid","liver spot"));
        topics.get(2).addQuestion(new Question("A verruca is also known as a ____________.","wart","keratoma","skin tag","mole"));
        topics.get(2).addQuestion(new Question("The American Cancer Society recommends using the ABCDE Cancer Checklist. What does the “D” stand for?","Diameter","Density","Dermatologist","Diagnosis"));
        topics.get(2).addQuestion(new Question("Sores that do not heal could be a sign of _______.","skin cancer","acne","lentigines","nevus"));
        topics.get(2).addQuestion(new Question("The American Cancer Society recommends using the ABCDE Cancer Checklist. What does the “A” stand for?","Asymmetry","Appearance","Aggressiveness","Age"));
        topics.get(2).addQuestion(new Question("What can cause an excoriation?","Scratching","Excessive dandruff","Post-operative repair","Severely chapped hands"));
        topics.get(2).addQuestion(new Question("What causes a wheal?","Poison ivy","Cancer","Impetigo","Mosquito bite"));

        topics.get(3).addQuestion(new Question("What type of hair is the long, coarse hair found on the scalp, legs, and arms?","Terminal","Medulla","Lanugo","Vellus"));
        topics.get(3).addQuestion(new Question("It is normal to lose an average of _________ hairs per day.","75 to 100","25 to 30","100 to 200","10 to 15"));
        topics.get(3).addQuestion(new Question("How long does the telogen phase last?","3 to 6 months","3 to 5 years","1 to 2 weeks","10 years"));
        topics.get(3).addQuestion(new Question("Which of the following is an indication of the strength of the side bonds in the hair?","Elasticity","Porosity","Density","Texture"));
        topics.get(3).addQuestion(new Question("___________ is a characteristic of scabies.","Excessive itching","Cuplike crusts","A boil","Red papules"));
        topics.get(3).addQuestion(new Question("Curly or wavy hair may stretch up to what percentage of its original length?","50 percent","25 percent","100 percent","75 percent"));
        topics.get(3).addQuestion(new Question("Dandruff is the result of a___________.","fungus","viral infection","parasite","bacterial infection"));
        topics.get(3).addQuestion(new Question("What disorder is often seen in men and women of Mediterranean, African, Hispanic, and Jewish ethnicity?","Pseudofolliculitis barbae.","Furuncles.","Sycosis vulgaris.","Folliculitis barbae."));
        topics.get(3).addQuestion(new Question("The average growth rate of healthy hair on the scalp is how many inches per month?","1/2 inch","1 inch","1/4 inch","2 inches"));
        topics.get(3).addQuestion(new Question("Which of the following is the technical term for dandruff?","Pityriasis","Canities","Trichoptilosis","Tinea"));
        topics.get(3).addQuestion(new Question("What type of hair is more susceptible to damage from chemical services?","Fine","Medium","Coarse","Wiry"));
        topics.get(3).addQuestion(new Question("Where are hair follicles not distributed on the body?","Soles of the feet","Fingers","Backs of the hands","Toes"));
        topics.get(3).addQuestion(new Question("Pseudofolliculitis barbae is also known as ___________.","razor bumps","barber’s itch","classic dandruff","ringworm"));
        topics.get(3).addQuestion(new Question("The spiral shape of a coiled protein is called a_______.","helix","polypeptide chain","keratin","trichology"));
        topics.get(3).addQuestion(new Question("What joins two polypeptide strands together?","Cystine","Melanin","End bond","Helix"));
        topics.get(3).addQuestion(new Question("A salt bond is re-formed by ______________.","normalizing Ph","cooling","oxidation with a neutralizer","drying"));
        topics.get(3).addQuestion(new Question("During what hair phase are new cells manufactured in the hair follicle?","Anagen","Catagen","Resting","Telogen"));
        topics.get(3).addQuestion(new Question("Hair texture is measured by the _______of the hair strand.","diameter","weight","color","finish"));
        topics.get(3).addQuestion(new Question("Antidandruff shampoos contain _________ ingredients to help control dandruff.","antifungal","disinfectants","antibiotic","salicylic acid"));
        topics.get(3).addQuestion(new Question("Hair with a high porosity level is usually the result of ___________.","previous overprocessing","poor nutrition","genetics","internal disorders"));
        topics.get(3).addQuestion(new Question("The cuticle layer of the hair is responsible for the ___________of the hair.","shine and silkiness","elasticity","natural color","strength"));
        topics.get(3).addQuestion(new Question("The number of hairs on the head varies with the ______ of the hair.","color","porosity","texture","elasticity"));
        topics.get(3).addQuestion(new Question("Clients who exhibit symptoms of __________ should be referred to a physician.","alopecia areata","alopecia senilis","alopecia prematura","androgenic alopecia"));
        topics.get(3).addQuestion(new Question("________ is the most common permanent hair replacement technique.","Hair transplant","Hair weaves","Topical treatment","Oral prescription medication"));
        topics.get(3).addQuestion(new Question("In men, ___________ is known as male pattern baldness.","androgenic alopecia","alopecia senilis","alopecia universalis","alopecia syphilitica"));
        topics.get(3).addQuestion(new Question("Canities is the technical term for _____.","gray hair","knotted hair","beaded hair","split ends"));
        topics.get(3).addQuestion(new Question("What do salt bonds depend on?","Ph","Heat","Oxidation","Water"));
        topics.get(3).addQuestion(new Question("The only way to remove split ends is_________.","to cut them","hair conditioning","with scalp conditioning","hair oils"));
        topics.get(3).addQuestion(new Question("Hypertrichosis is a condition of _____________.","abnormal growth of hair","brittle hair","split ends","gray hair"));
        topics.get(3).addQuestion(new Question("Head lice can live away from the human body for up to how long?","48 hours","72 hours","1 month","1 week"));
        topics.get(3).addQuestion(new Question("Complete body hair loss is called __________.","alopecia universalis","alopecia areata","alopecia totalis","alopecia senilis"));
        topics.get(3).addQuestion(new Question("What phase determines how long the hair will grow before shedding?","Anagen","Catagen","Resting","Telogen"));
        topics.get(3).addQuestion(new Question("What type of hair has a hard, glassy finish?","Wiry","Fine","Coarse","Medium"));
        topics.get(3).addQuestion(new Question("Barbers may encounter bacterial staphylococci infections in the form of different types of _____________.","folliculitis","malassezia","pityriasis","pediculosis"));
        topics.get(3).addQuestion(new Question("Disulfide bonds broken by hydroxide relaxers __________.","are permanently broken","re-form when the hair cools","re-form when the hair dries","re-form as peptide bonds"));
        topics.get(3).addQuestion(new Question("Hair __________ can be determined by feeling a single strand of dry hair between the fingers.","texture","density","elasticity","porosity"));
        topics.get(3).addQuestion(new Question("What layer of hair may be absent in very fine and naturally blond hair?","Medulla","Cuticle","Cortex","Dermal papilla"));
        topics.get(3).addQuestion(new Question("What percentage of the total weight of the hair comes from the cortex?","90 percent","50 percent","10 percent","75 percent"));
        topics.get(3).addQuestion(new Question("Which glands are attached to each hair follicle?","Sebaceous","Sudoriferous","Thyroid","Pituitary"));
        topics.get(3).addQuestion(new Question("Disulfide bonds are broken by ___________.","chemical relaxers","alkaline solutions","water","heat"));
        topics.get(3).addQuestion(new Question("During which stage of life are the endocrine glands most active?","Adolescence.","Infancy.","Middle age.","Old age."));
        topics.get(3).addQuestion(new Question("Hair is composed chiefly of a fibrous protein called ________.","keratin","melanin","eumelanin","cysteine"));
        topics.get(3).addQuestion(new Question("Which of the following is a tuft of hair that stands straight up?","Cowlick","Natural part","Whorl","Hair stream"));
        topics.get(3).addQuestion(new Question("Hair porosity is the ability of the hair to____________.","absorb moisture","have an odor","stretch","return to its original length without "));
        topics.get(3).addQuestion(new Question("Which scalp condition is characterized by an accumulation of greasy or waxy scales mixed with sebum?","Pityriasis steatoides","Furuncle","Tinea","Pediculosis capitis"));
        topics.get(3).addQuestion(new Question("It is more difficult for hair lighteners, hair colors, and waving solutions to penetrate what type of hair?","Coarse","Medium","Fine","Wiry"));
        topics.get(3).addQuestion(new Question("The average hair density is approximately how many strands per square inch?","2200","75","100","100 000"));
        topics.get(3).addQuestion(new Question("Hydrogen bonds are broken when hair gets ________.","wet","dry","cut","brushed"));
        topics.get(3).addQuestion(new Question("You should not begin any service if___________ are present.","parasites","pityriasis","hypertrophies","fraglitas crinium"));
        topics.get(3).addQuestion(new Question("The changes that take place in the hair during chemical services occur within the _______.","cortex","cuticle","medulla","melanin"));
        topics.get(3).addQuestion(new Question("Products that claim to increase hair growth are regulated as ____________.","drugs","genetic products","cosmetics","natural products"));
        topics.get(3).addQuestion(new Question("The ________ is the outermost layer of the hair.","cuticle","cortex","bulb","medulla"));
        topics.get(3).addQuestion(new Question("Acquired canities develops with ________.","age","ingrown hairs","too much melanin","improper shaving"));
        topics.get(3).addQuestion(new Question("The _________ contains the blood and nerve supply that provides nutrients for hair growth.","dermal papilla","hair shaft","hair bulb","arrector pili"));
        topics.get(3).addQuestion(new Question("If you can feel a slight roughness in the hair, the hair is _________.","porous","brittle","over-porous","resistant"));
        topics.get(3).addQuestion(new Question("_____________ is characterized by the sudden falling out of hair in round patches, which creates bald spots.","Alopecia areata","Alopecia senilis","Androgenic alopecia","Alopecia syphilitica"));
        topics.get(3).addQuestion(new Question("Finasteride is an oral prescription medication for men, sold under the brand name _______.","Propecia","Theroxidil","Rogaine","Minoxidil"));
        topics.get(3).addQuestion(new Question("Hair that breaks easily or fails to return to its normal length has low _________.","elasticity","porosity","Ph","absorption"));
        topics.get(3).addQuestion(new Question("What condition can be worsened by irritation caused by shaving or continual nasal discharge?","Sycosis vulgaris","Tinea favosa","Scabies","Pediculosis capitis"));
        topics.get(3).addQuestion(new Question("A possible side effect of finasteride is ________.","weight gain","increase in sexual function","weight loss","increasing the rate of hair loss"));
        topics.get(3).addQuestion(new Question("Some fine or very fine hair does not possess a ___________.","medulla","cuticle","diameter","cortex"));
        topics.get(3).addQuestion(new Question("The lower part of the hair bulb is hollow and fits over and covers the _______.","dermal papilla","epidermis","dermis","follicle"));
        topics.get(3).addQuestion(new Question("40 percent of men and women show hair loss by age ____.","35","40","18","25"));
        topics.get(3).addQuestion(new Question("Salt bonds are easily broken by __________.","strong acidic solutions","heat","water","mildly acidic solutions"));
        topics.get(3).addQuestion(new Question("All forms of tinea are___________.","highly contagious","permanent","highly unpredictable","the result of genetics"));

        topics.get(4).addQuestion(new Question("Which of the following give shine and manageability to dry or curly hair?","Hairdressings","Epilators","Hair sprays","Scalp lotions"));
        topics.get(4).addQuestion(new Question("Ingredients commonly used in wrinkle creams include hormones and ________.","collagen","sodium hydroxide","coconut","para-aminobenzoic acid"));
        topics.get(4).addQuestion(new Question("Permanent haircolor creates chemical changes in the hair when ______ takes place.","oxidation","exothermic reaction","reduction","combustion"));
        topics.get(4).addQuestion(new Question("Hair tonics are liquid or cream preparations considered to be _________.","grooming or styling aids","repair treatments","medicated ointments","thermal protection"));
        topics.get(4).addQuestion(new Question("What is it called when certain chemical reactions release energy in the form of heat?","Exothermic reaction","Oxidation","Endothermic reaction","Reduction"));
        topics.get(4).addQuestion(new Question("What compounds are formed by the reaction of acids and bases, with water also being produced by the reaction?","Salts","Acids","Oxides","Bases"));
        topics.get(4).addQuestion(new Question("Organic chemistry is the study of substances that contain the element ____.","carbon","hydrogen","sulfur","oxygen"));
        topics.get(4).addQuestion(new Question("What are elements made of?","Atoms","Cells","Chemicals","Water"));
        topics.get(4).addQuestion(new Question("Alkalis _______ and swell the hair.","soften","curl","harden","constrict"));
        topics.get(4).addQuestion(new Question("Which of the following are used during facials and shaves in the barbershop?","Cleansing creams","Depilatories","Massage creams","Epilators"));
        topics.get(4).addQuestion(new Question("What substance is used to neutralize acids or raise the pH of hair products?","Alkanolamines","Silicones","Witch hazel","Formaldehyde"));
        topics.get(4).addQuestion(new Question("_________are unstable uniform mixtures of two or more substances.","Suspensions","Solutes","Solvents","Solutions"));
        topics.get(4).addQuestion(new Question("What is the most common element found in the known universe?","Hydrogen","Carbon","Oxygen","Sodium"));
        topics.get(4).addQuestion(new Question("The atomic number of an element indicates how many ______ are in one atom of that element.","protons","molecules","electrons","neutrons"));
        topics.get(4).addQuestion(new Question("What is a negatively charged ion called?","Anion","Cation","Proton","Neutron"));
        topics.get(4).addQuestion(new Question("All acids owe their chemical reactivity to what ion?","Hydrogen","Oxygen","Hydroxide","Nitrogen"));
        topics.get(4).addQuestion(new Question("_______ is an example of a physical mixture.","Powder","Acid","Alkali","Oxide"));
        topics.get(4).addQuestion(new Question("Bases are compounds of hydrogen, a metal, and ___________.","oxygen","sulfur","nitrogen","sodium chloride"));
        topics.get(4).addQuestion(new Question("Which of the following are chemical compounds that attract and retain moisture from the atmosphere?","Humectants","Fatty alcohols","Moisturizers","Silicones"));
        topics.get(4).addQuestion(new Question("Where do conditioners typically range on the pH scale?","3.0 to 5.5","2.0 to 3.0","Above 7.0","4.5 to 5.5"));
        topics.get(4).addQuestion(new Question("What type of shampoo is designed to prevent the stripping of haircolor from the hair?","pH-balanced","Conditioning","Balancing","Neutralizing"));
        topics.get(4).addQuestion(new Question("An example of a chemical change is____________.","rusting iron","temporary haircolor","water freezing","ice melting"));
        topics.get(4).addQuestion(new Question("Most conditioners contain a large amount of _________.","fatty materials","protein","surfactant","protein derivatives"));
        topics.get(4).addQuestion(new Question("When acids and alkalis are mixed together in equal proportions, they neutralize each other to form __________.","water and a salt","water and alcohol","sodium hydroxide and water","salt and hydrogen"));
        topics.get(4).addQuestion(new Question("Shampoos consist of two main ingredients: water and _________.","surfactants","alcohol","dyes","oxides"));
        topics.get(4).addQuestion(new Question("An example of a physical change is____________.","temporary haircolor","oxidation of haircolor products","rusting iron","burning wood"));
        topics.get(4).addQuestion(new Question("Which shampoo is a good choice for color-treated and chemically treated hair?","Sulfate-free","Neutralizing","Dry or powder","Balancing"));
        topics.get(4).addQuestion(new Question("Which of the following cannot occur without reduction?","Oxidation","Physical change","Exothermic reaction","Endothermic reaction"));
        topics.get(4).addQuestion(new Question("Miscible liquids, such as water and alcohol, are mutually _______.","soluble","unstable","available","interchangeable"));
        topics.get(4).addQuestion(new Question("What type of shampoo has an astringent quality that allows the product to evaporate quickly?","Liquid-dry","Clear liquid","Dry or powder","Cream"));
        topics.get(4).addQuestion(new Question("In an oil-in-water (O/W) emulsion, droplets of oil are dispersed in water, where they are surrounded by _________.","surfactants","suspensions","solvents","solutes"));
        topics.get(4).addQuestion(new Question("What type of shampoo should never be given prior to a chemical service?","Dry or powder","Cream","Liquid-dry","Clear liquid"));
        topics.get(4).addQuestion(new Question("When oxygen is chemically removed from a substance, the substance is_________.","reduced","evaporated","oxidized","divided"));
        topics.get(4).addQuestion(new Question("What substance is made by mixing plant oils or animal fats with strong alkaline substances?","Soaps","Suntan lotions","Wrinkle treatment creams","Styling aids"));
        topics.get(4).addQuestion(new Question("What type of conditioners are deep, penetrating formulations that help restore moisture and protein in the hair?","Treatment","Medicated","Instant","Leave-in"));
        topics.get(4).addQuestion(new Question("What type of molecules are chemical combinations of two or more atoms of different elements?","Compound","Definite fixed proportion","Elemental","Atomic"));
        topics.get(4).addQuestion(new Question("Pure water contains the same number of hydrogen ions as hydroxide ions, which makes it __________.","neutral","alkaline","base","acidic"));
        topics.get(4).addQuestion(new Question("What types of shampoos are designed for oily hair and scalps?","Balancing","Neutralizing","Conditioning","Color-enhancing"));
        topics.get(4).addQuestion(new Question("Acids have a pH below 7.0 and taste________.","sour","sweet","salty","bitter"));
        topics.get(4).addQuestion(new Question("Which of the following is an example of an inorganic substance?","Minerals","Pesticides","Plastics","Gasoline"));
        topics.get(4).addQuestion(new Question("Moisturizing creams are designed to treat _________.","dryness","oiliness","acne","dandruff"));
        topics.get(4).addQuestion(new Question("Which of the following conditioners is designed for use with thermal tools?","Leave-in","Instant","Repair","Medicated"));
        topics.get(4).addQuestion(new Question("Astringent scalp tonics _____________.","help remove oil accumulation on the scalp","soften the scalp","are prescribed by a physician","promote healing of the scalp"));
        topics.get(4).addQuestion(new Question("An emulsion is a suspension of one liquid dispersed in _______.","another","an unstable mixture","an unstable mixture","a solid"));
        topics.get(4).addQuestion(new Question("Which of the following is an example of a pure substance?","Gold","Air","Salt","Concrete"));
        topics.get(4).addQuestion(new Question("Which of the following is an example of an emulsion?","Shampoo","Paint","Calamine lotion","Witch hazel"));
        topics.get(4).addQuestion(new Question("Ice is water in which state of matter?","Solid.","Liquid.","Plasma.","Gas."));
        topics.get(4).addQuestion(new Question("The pH range of hair and skin is _______.","4.5 to 5.5","2.0 to 3.5","7","7,4"));
        topics.get(4).addQuestion(new Question("As toners, acidic solutions tend to do what to the skin?","Tighten","Moisten","Soften","Loosen"));

        topics.get(5).addQuestion(new Question("To practice opening and closing the shears, you should use only the ______ to manipulate the moving blade of the shears.","thumb","index finger","ring finger","little finger"));
        topics.get(5).addQuestion(new Question("Which of the following controls the distance between the blades?","Tension screw.","Finger tang.","Bumper.","Set."));
        topics.get(5).addQuestion(new Question("To clean a hone, use water and __________.","a pumice stone","a cotton towel","disinfectants","soap"));
        topics.get(5).addQuestion(new Question("The French-style shear has a finger rest or tang for the _________.","little finger","index finger","thumb","ring finger"));
        topics.get(5).addQuestion(new Question("How you hold the straight razor will depend on the ____________.","procedure to be performed","hair texture","condition of the razor’s edge","barber’s personal preference"));
        topics.get(5).addQuestion(new Question("Which of the following is used to temporarily straighten curly or wavy hair?","Electric flat iron","Electric curling iron","Blowdryer","Electric massager"));
        topics.get(5).addQuestion(new Question("The first step in a cloth towel wrap is to________.","grasp the towel lengthwise","hold the towel diagonally","hold the towel at one end","grasp the towel ends and twist"));
        topics.get(5).addQuestion(new Question("The electric stove is used to heat _______.","metal pressing combs","soap lather","electric flat irons","electric curling irons"));
        topics.get(5).addQuestion(new Question("What type of towels may be preferred for chemical services?","Terry cloth","Barber","Disposable","Paper"));
        topics.get(5).addQuestion(new Question("Cutting against the grain cuts the hair _____ than cutting with the grain.","shorter","faster","slower","longer"));
        topics.get(5).addQuestion(new Question("What type of shears are chunking shears?","Texturizing.","Thinning.","Crane.","Blending."));
        topics.get(5).addQuestion(new Question("As a barber, an appliance you will use is a ______.","clipper","brush","comb","blowdryer"));
        topics.get(5).addQuestion(new Question("The razor is stroked ________ diagonally across the hone.","edge-first","right to left","edge-last","left to right"));
        topics.get(5).addQuestion(new Question("To palm the razor for hair combing, roll the razor into your hand with the blade facing _________ the comb.","away from","toward","in front of","behind"));
        topics.get(5).addQuestion(new Question("Which of the following are essential tools for finish and detail work?","Outliners","Brushes","Clippers","Combs"));
        topics.get(5).addQuestion(new Question("Shampoo capes are waterproof drapes made of ________.","vinyl","nylon","wool","cotton"));
        topics.get(5).addQuestion(new Question("Combs made from _________ are antistatic and stiff.","carbon materials","metal","hard rubber","graphite"));
        topics.get(5).addQuestion(new Question("A flat handle comb with evenly spaced teeth works best for__________.","achieving a flat-top style","trimming mustaches","general haircutting and styling","sectioning longer hair"));
        topics.get(5).addQuestion(new Question("Paper neck strips are used for, but may not facilitate, a thorough ________.","dusting","disinfecting","cleaning","sterilization"));
        topics.get(5).addQuestion(new Question("What type of hone cuts faster than the water hone?","Synthetic","Combination","Natural","Belgium"));
        topics.get(5).addQuestion(new Question("During a haircut, you will be holding the ______and shears at the same time.","comb","blowdryer","brush","razor"));
        topics.get(5).addQuestion(new Question("The strop is attached to the __________ of the barber chair by a closed clip.","arm","headrest","base","back"));
        topics.get(5).addQuestion(new Question("Choosing the right implement or tool for the job will depend on your understanding of the item’s_________.","functions","popularity","color","age"));
        topics.get(5).addQuestion(new Question("Transferring the comb to the opposite hand after combing to facilitate haircutting is called ___________.","palming the comb","manipulating the comb","palming the shears","holding the comb"));
        topics.get(5).addQuestion(new Question("A pivot motor clipper would work best on what type of hair?","Coarse","Dry","All types","Fine"));
        topics.get(5).addQuestion(new Question("Outliners require very _________ against the skin.","little pressure","hot blades","hard pressure","firm pressure"));
        topics.get(5).addQuestion(new Question("In what type of handle design are the finger and thumb grips positioned directly across from each other?","Opposing.","Crane.","Offset.","Standard."));
        topics.get(5).addQuestion(new Question("You should never use a blowdryer near ________.","water","a heated stove","other electrical appliance","damp hair"));
        topics.get(5).addQuestion(new Question("Razor shapers are also known as ________.","hair shapers","edgers","outliners","blending shears"));
        topics.get(5).addQuestion(new Question("What type of combs can retain heat to help seta hairstyle?","Metal.","Graphite.","Carbon.","Hard rubber."));
        topics.get(5).addQuestion(new Question("_________ the razor refers to a special heat treatment included in the manufacturing process.","Tempering","Sizing","Grinding","Balancing"));
        topics.get(5).addQuestion(new Question("One of the structural parts of the straight razor is the _________.","pivot","tail","teeth","thumb grip"));
        topics.get(5).addQuestion(new Question("Avoid judging a razor based on _________.","color or design","quality","its company","other barbers’ opinions"));
        topics.get(5).addQuestion(new Question("A natural bristle brush is made from what type of bristles?","Boar.","Flexible nylon.","Synthetic.","Rigid nylon."));
        topics.get(5).addQuestion(new Question("A vented brush is designed to ___________.","facilitate quicker drying","create curl in blowdry styling","avoid snagging wet hair","create volume"));
        topics.get(5).addQuestion(new Question("What style of comb is preferable for detangling?","Widetoothed.","Metal.","Tail.","Narrowtoothed."));
        topics.get(5).addQuestion(new Question("You should hold the clippers __________.","in a manner that permits free wrist movement","with both hands at the same time","with a strong, rigid grip","a few inches from the client's scalp"));
        topics.get(5).addQuestion(new Question("Clipper blades are usually made of high-quality ____________.","carbon steel","aluminum","plastic","graphite"));
        topics.get(5).addQuestion(new Question("A number of states prohibit the use of _________.","hair dusters","cloth towels","paper neck strips","vacuum systems"));
        topics.get(5).addQuestion(new Question("A _______ is an abrasive material that has the ability to cut steel.","hone","strop","guard","tang"));
        topics.get(5).addQuestion(new Question("Detachable-blade clippers utilize removable blades in a variety of sizes to _________.","achieve different hair lengths","achieve a flat-top style","reduce noise while cutting","create tension when cutting"));
        topics.get(5).addQuestion(new Question("Soap lather on lather brushes are used to _______ the beard.","soften","medicate","disinfect","sterilize"));
        topics.get(5).addQuestion(new Question("The __________ introduces water-soluble products into the skin during a facial.","galvanic machine","high-frequency machine","thermal styling tool","come done extractor"));
        topics.get(5).addQuestion(new Question("Cast shears are made by heating ________ to a liquid form for pouring into a mold.","steel","graphite","plastic","hard rubber"));
        topics.get(5).addQuestion(new Question("The outside of what type of blade edge has a clamshell or half-moon shape?","Convex.","Concave.","Semi-beveled.","Beveled."));
        topics.get(5).addQuestion(new Question("The ________ refers to the inside construction of the blade.","cutting edge","bumper","set","grind"));
        topics.get(5).addQuestion(new Question("A beveled-edge blade usually has what type of edge?","Corrugated (serrated).","One that must be sharpened every 4 to 6 months.","Dull.","Nicked."));
        topics.get(5).addQuestion(new Question("The term ________ is used when describing a cutting tool measuring less than 6 inches.","scissors","trimmers","clippers","shears"));
        topics.get(5).addQuestion(new Question("What type of razor finish is usually the choice of the discriminating barber?","Crocus","Plated nickel","Plain","Plated silver"));
        topics.get(5).addQuestion(new Question("The razor of choice for professional barbering is the _________ razor.","straight","safety","detachable-blade","cordless"));

        topics.get(6).addQuestion(new Question("Once the hair is dry and the graduated cut is completed, detail the _______.", "perimeter", "bob line", "interior", "bang area"));
        topics.get(6).addQuestion(new Question("When you complete a blunt cut, you should see an even, ________ line all the way around the head.", "horizontal", "wedge-shaped", "vertical", "graduated"));
        topics.get(6).addQuestion(new Question("__________ is a technique used to keep curly hair smooth and straight while retaining a beautiful shape.", "Hair wrapping", "Finger waving", "Blowdry styling", "Thermal waving"));
        topics.get(6).addQuestion(new Question("Thermal hair straightening is also known as __________.", "hair molding", "hair wrapping", "hair pressing", "thermal waving"));
        topics.get(6).addQuestion(new Question("The blunt cut is also known as a ________cut.", "one-length", "wedge", "stacked", "uniform-layered"));
        topics.get(6).addQuestion(new Question("On-base roller placement sits directly on the base and produces what type of curl?", "Full volume", "Tight", "Pin", "Loose"));
        topics.get(6).addQuestion(new Question("Short, tapered looks in men's cutting appear more______ in their overall form.", "angular", "rugged", "lived-in", "soft"));
        topics.get(6).addQuestion(new Question("Which of the following are secured with a hair clip, dried, and styled?", "Pin curls", "Plastic rollers", "Velcro rollers", "Hot rollers"));
        topics.get(6).addQuestion(new Question("When cutting women’s hair, keep the hair ________when cutting.", "damp", "wet", "parted", "dry"));
        topics.get(6).addQuestion(new Question("Once the long-layered haircut is dry, detail the interior and perimeter using ___________.", "deep point cutting", "slithering", "notching", "carving"));
        topics.get(6).addQuestion(new Question("When using clippers, curly hair should be clean and ________.", "dry", "wet", "damp", "parted"));
        topics.get(6).addQuestion(new Question("Which of the following are used to temporarily straighten hair?", "Electric flat irons", "Marcel irons", "Electric thermal irons", "Blowdryer"));
        topics.get(6).addQuestion(new Question("For the blunt cut, you should start in the center and comb the hair to natural fall at what degree of elevation?", "0 degree", "180 degree", "90 degree", "45 degree"));
        topics.get(6).addQuestion(new Question("Curly hair tends to graduate naturally due to the ________ and curl pattern.", "elasticity", "porosity", "texture", "density"));
        topics.get(6).addQuestion(new Question("What is the most common elevation for a graduated cut?", "45 degrees.", "0 degrees.", "90 degrees.", "180 degrees."));
        topics.get(6).addQuestion(new Question("Razor cuts are not recommended on what type of hair?", "Coarse, thin", "Fine, thin", "Medium, thick", "Fine, medium"));
        topics.get(6).addQuestion(new Question("What type of hair is easier to cut with clippers?", "Thick, coarse hair.", "Extremely curly hair.", "Clean damp hair.", "Curly hair of medium density."));
        topics.get(6).addQuestion(new Question("When __________, the blades are kept open, and only the portion of the blade near the pivot is used for cutting.", "Slicing", "Notching", "Slithering", "Point cutting"));
        topics.get(6).addQuestion(new Question("When cutting hair with a razor, the hair must be ___________.", "damp", "parted", "wet", "dry"));
        topics.get(6).addQuestion(new Question("Which of the following occurs when the hair is combed away from its natural fall position?", "Overdirection", "Slithering", "Texturing", "Notching"));
        topics.get(6).addQuestion(new Question("What type of cut builds weight and volume along the perimeter of the hairstyle?", "Graduated", "Blunt", "Long-layered", "Uniform-layered"));
        topics.get(6).addQuestion(new Question("For the uniform-layered cut, to create a guide, take a _____ profile section from the front hairline to the nape.", "1/2-inch-wide", "1 1/2-inch-wide", "1-inch-wide", "1/4-inch-wide"));
        topics.get(6).addQuestion(new Question("Women’s styling is often more rounded and _________.", "softer", "tapered", "lived-in", "rugged"));
        topics.get(6).addQuestion(new Question("Finger waving is the process of shaping and directing the hair into what type of pattern?", "S-shaped", "Contoured", "Spiral", "Circular"));
        topics.get(6).addQuestion(new Question("For the graduated cut, you should begin your first section by taking the parting from the client’s natural ________ back to the crown.", "side part", "widow’s peak", "middle part", "cowlick"));


        topics.get(7).addQuestion(new Question("What type of haircolor washes out or fades within a few weeks?", "Semipermanent", "Permanent", "Demipermanent", "Temporary"));
        topics.get(7).addQuestion(new Question("Which of the following are not professional haircoloring products?", "Metallic dyes", "Aniline derivative tints", "Henna", "Oxidation tints"));
        topics.get(7).addQuestion(new Question("Which of the following is an example of a single-process coloring?", "Virgin tint applications.", "Fillers and tints.", "Pre-softener and tint applications.", "Lightener and toner applications."));
        topics.get(7).addQuestion(new Question("A(n)________ requires that a predisposition test be performed.", "aniline derivative", "metallic ingredient", "vegetable tint", "mineral dye"));
        topics.get(7).addQuestion(new Question("Diffused melanin is called_____________.", "oxymelanin", "pheomelanin", "eumelanin", "keratin"));
        topics.get(7).addQuestion(new Question("What type of haircolor can act as a filler in color correction?", "Demipermanent", "Semipermanent", "Permanent", "Temporary"));
        topics.get(7).addQuestion(new Question("Which of the following is a form of highlighting?", "Streaking", "Retouching", "Pre-softening", "Tint back"));
        topics.get(7).addQuestion(new Question("Which of the following can be used as temporary coloring for mustaches, beards, or sideburns?", "Crayons", "Color rinses", "Haircolor sprays", "Haircolor gels"));
        topics.get(7).addQuestion(new Question("The human eye sees only how many basic colors?", "Six", "Twelve", "Nine", "Three"));
        topics.get(7).addQuestion(new Question("Hair with uneven color distribution or pre-lightened hair may benefit from a ____________ application.", "color filler", "retouch", "virgin", "toner"));
        topics.get(7).addQuestion(new Question("Which of the following is the most popular on-the-scalp lightener?", "Cream", "Quick", "Oil", "Powder"));
        topics.get(7).addQuestion(new Question("What type of oil lightener removes pigment without adding color tone?", "Neutral", "Silver", "Drab", "Gold"));
        topics.get(7).addQuestion(new Question("The chemical composition of a temporary color is_________.", "acidic", "unpredictable", "mildly alkaline", "strongly alkaline"));
        topics.get(7).addQuestion(new Question("An example of complementary colors would be_________.", "yellow and violet", "yellow-orange", "blue-green", "red-orange"));
        topics.get(7).addQuestion(new Question("What type of lightener is often used for a lightener retouch because it helps prevent overlapping on the previously lightened hair?", "Cream", "Speed", "Oil", "Powder"));
        topics.get(7).addQuestion(new Question("_________is the basic name of a color.", "Hue", "Level", "Base", "Tone"));
        topics.get(7).addQuestion(new Question("Hair is considered damaged when it exhibits____________.", "brittleness and dryness", "an inability to break easily", "smoothness to the touch", "elasticity"));
        topics.get(7).addQuestion(new Question("Permanent haircoloring products are regarded as the best products for__________.", "covering gray hair", "toning pre-lightened hair", "acting as a filler in color correction", "neutralizing yellow or other unwanted tones"));
        topics.get(7).addQuestion(new Question("_________ hair will appear to have more red, yellow, or orange than the intended color.", "Underlightened", "Overlightened", "Damaged", "Pre-lightened"));
        topics.get(7).addQuestion(new Question("Traditional __________ colors usually last from six to eight shampoos.", "demipermanent", "temporary", "semipermanent", "permanent"));
        topics.get(7).addQuestion(new Question("When washing lightened hair, you should ___________.", "use a mild shampoo and rinse with cool water", "use a strong shampoo and rinse with cool water", "use a mild shampoo and rinse with hot water", "use a strong shampoo and rinse with hot water"));
        topics.get(7).addQuestion(new Question("Which of the following provides natural black and brown pigment to hair?", "Eumelanin", "Protein", "Lanolin", "Pheomelanin"));
        topics.get(7).addQuestion(new Question("Hair dyed with lead will _________.", "lighten immediately", "not change color", "lighten in spots", "show no reaction at all"));
        topics.get(7).addQuestion(new Question("Cream lighteners contain conditioning agents, thickeners, and __________.", "bluing agents", "oxygen-releasing boosters", "drabbers", "alkaline swelling agents"));
        topics.get(7).addQuestion(new Question("A single-application permanent tint is applied on _________ hair.", "dry", "wet", "oily", "dirty"));
        topics.get(7).addQuestion(new Question("As soon as hydrogen peroxide is mixed into the lightener formula, it begins to release________.", "oxygen", "hydrogen", "toxins", "irritants"));
        topics.get(7).addQuestion(new Question("You should cap all bottles of developer and lightener to avoid_________.", "loss of strength", "dripping or running", "breathing in vapors", "touching of the skin"));
        topics.get(7).addQuestion(new Question("What should you do with leftover tint?", "Discard it.", "Store it in a sealed bag.", "Set it aside for a future retouch.", "Pour it back into its original container."));
        topics.get(7).addQuestion(new Question("When mixed together, complementary colors _________ each other.", "neutralize", "equalize", "minimize", "maximize"));
        topics.get(7).addQuestion(new Question("Which of the following refers to the degree of concentration or amount of pigment in the color?", "Saturation", "Tone", "Hue", "Level"));
        topics.get(7).addQuestion(new Question("The purpose of lighteners is to dissolve or remove __________.", "melanin", "protein", "lanolin", "aniline"));
        topics.get(7).addQuestion(new Question("Soap caps can be used to_________________.", "retouch applications", "brighten existing color", "determine how the hair will react to the haircolor product", "process of coloring hair back to its natural color"));
        topics.get(7).addQuestion(new Question("Most semipermanent colors do not contain ________and may be used right out of the bottle.", "ammonia", "oxidizers", "solvents", "surfactants"));
        topics.get(7).addQuestion(new Question("What type of lightener is often used for a lightener retouch because it helps prevent overlapping on the previously lightened hair?", "Cream", "Speed", "Oil", "Powder"));
        topics.get(7).addQuestion(new Question("_______ hair is the result of a reduction in the production of melanin pigments.", "Gray", "Black", "Blond", "White"));
        topics.get(7).addQuestion(new Question("Hair treated with a compound, metallic, or other coating dye looks _______.", "dry and dull", "healthy", "shiny", "natural"));
        topics.get(7).addQuestion(new Question("When mixed together, complementary colors _________ each other.", "neutralize", "maximize", "minimize", "duplicate"));
        topics.get(7).addQuestion(new Question("Permanent haircolors are mixed with _____________.", "developers", "tints", "restorers", "relaxers"));
        topics.get(7).addQuestion(new Question("Semipermanent tints do not require the use of _____________.", "hydrogen peroxide", "ammonia", "solvents", "alkaline agents"));
        topics.get(7).addQuestion(new Question("Which of the following is an indication of the strength of the cortex?", "Elasticity", "Porosity", "Texture", "Density"));
        topics.get(7).addQuestion(new Question("The laws of color serve as guidelines for __________ color mixing.", "harmonious", "selective", "temporary", "permanent"));
        topics.get(7).addQuestion(new Question("Tints must be mixed with hydrogen peroxide, which activates the chemical reaction known as __________.", "oxidation", "nonoxidation", "decolorization", "stabilization"));
        topics.get(7).addQuestion(new Question("What color do lead dyes leave the hair?", "Purple", "Green", "Gray", "Red"));
        topics.get(7).addQuestion(new Question("Double-process haircoloring begins with hair _____________.", "lightening", "relaxing", "tinting", "toning"));
        topics.get(7).addQuestion(new Question("You should not allow hydrogen peroxide formulations to come in contact with ________.", "metal", "plastic", "cream", "powder"));
        topics.get(7).addQuestion(new Question("When using semipermanent color, what type of color will appear shinier due to the reflection of light?", "Warm", "Ash", "Gray", "Cool"));
        topics.get(7).addQuestion(new Question("You should avoid breathing in vapors caused by mixing ________ and haircolor products.", "hydrogen peroxide", "alkaline swelling agents", "surfactants", "ammonia"));
        topics.get(7).addQuestion(new Question("Cream lighteners contain conditioning agents called __________.", "bluing agents", "alkaline swelling agents", "drabbers", "tints"));
        topics.get(7).addQuestion(new Question("What type of color will appear shinier due to the reflection of light?", "Warm", "Ash", "Cool", "Gray"));
        topics.get(7).addQuestion(new Question("To achieve the desired lightness shade, consideration must be given to the__________.", "existing hair color", "resulting density", "existing elasticity", "new hair growth"));
        topics.get(7).addQuestion(new Question("Which is a characteristic of semipermanent tints?", "They do not require the use of hydrogen peroxide.", "They wash out after one or two shampoos.", "They require retouching.", "They do not require a patch test."));
        topics.get(7).addQuestion(new Question("Nonoxidizing versus oxidizing haircolor products determine a product's __________.", "colorfastness", "final outcome", "mineral dye", "degree of lightness"));
        topics.get(7).addQuestion(new Question("Temporary color rinses can be used to_____________.", "neutralize yellow tones in white or gray hair", "quicken the action of hydrogen peroxide", "even out color processing", "create special-effects haircoloring"));
        topics.get(7).addQuestion(new Question("What type of technique is painting a lightener or color directly onto clean, styled hair?", "Free-form", "Cap frost", "Reverse highlighting", "Foil frost"));
        topics.get(7).addQuestion(new Question("The purpose of lighteners is to dissolve or remove the hair's natural color pigment __________.", "melanin", "lanolin", "aniline", "protein"));
        topics.get(7).addQuestion(new Question("________ is the process of treating gray or other resistant hair to facilitate better color penetration.", "Pre-softening", "Lowlighting", "Pre-lightening", "Retouching"));
        topics.get(7).addQuestion(new Question("Which of the following should never be used for coloring mustaches?", "Aniline derivative tints", "Hair color crayons", "Liquid tints", "Pomades"));
        topics.get(7).addQuestion(new Question("Hair dyed with lead will _________.", "lighten immediately", "not change color", "lighten in spots", "show no reaction at all"));
        topics.get(7).addQuestion(new Question("Lightener on the towel that is allowed to come in contact with the skin will cause _____.", "irritation", "oxidation", "decolorization", "uneven color"));
        topics.get(7).addQuestion(new Question("Which colors are created by mixing equal amounts of two primary colors?", "Secondary", "Tertiary", "Quaternary", "Complementary"));
        topics.get(7).addQuestion(new Question("What is the standard hydrogen peroxide volume used with many permanent color products?", "20-volume", "30-volume", "40-volume", "10-volume"));
        topics.get(7).addQuestion(new Question("Double-process hair coloring begins with hair _____________.", "lightening", "relaxing", "toning", "tinting"));
        topics.get(7).addQuestion(new Question("Which is an example of a tertiary color?", "Blue-green", "Orange", "Violet", "Red"));
        topics.get(7).addQuestion(new Question("___________ lift trapped color pigments, stain, or buildup from cuticle layers.", "Oil-base dye removers", "Color oil lighteners", "Dye solvents", "Tint solvents"));

        topics.get(8).addQuestion(new Question("Where should you discard used blades?", "Sharps container", "Waste paper basket", "Garbage bag", "Sealed paper bag"));
        topics.get(8).addQuestion(new Question("You should use the thumb and_________ finger as the primary digits for stretching the skin.", "second", "ring", "little", "middle"));
        topics.get(8).addQuestion(new Question("For a shave service, barbers should analyze the client's skin and hair _________.", "growth patterns", "color", "porosity", "texture"));
        topics.get(8).addQuestion(new Question("What type of hair is often the result of improper hair removal by a razor, tweezers, or trimmer?", "Ingrown", "New", "Unshaven", "Curly"));
        topics.get(8).addQuestion(new Question("Check the proportion and shape of the beard in the mirror when client is in a(n) _________position.", "sitting", "reclining", "angled", "standing"));
        topics.get(8).addQuestion(new Question("If using a razor to shape and detail a mustache, apply ____________.", "shaving cream or gel", "a hot towel", "pH-balanced fresheners", "pH-balanced toners"));
        topics.get(8).addQuestion(new Question("Prepare facial hair for the shave with ____________________.", "hot towels and lather", "talcum powder", "soap and water", "astringents"));
        topics.get(8).addQuestion(new Question("For a shave service, right-handed barbers stand ____________.", "at the client's right side", "at the client's left side", "behind the client", "in front of the client"));
        topics.get(8).addQuestion(new Question("Which finger should you use to wipe lather from the hairline?", "Thumb", "Ring finger", "Little finger", "Index finger"));
        topics.get(8).addQuestion(new Question("What type of stroke should you use to shave the nape area?", "Freehand", "Backhand", "Reverse backhand", "Reverse freehand"));
        topics.get(8).addQuestion(new Question("The shaving movement for a left-handed barber _______ is reverse freehand and up.", "beneath the lower lip", "across the chin from right to left", "left jawbone to grain change", "under the chin to grain change"));
        topics.get(8).addQuestion(new Question("For a neck shave, clean the shaven part of the neckline with a towel or neck strip moistened with ___________.", "witch hazel", "pH-balanced fresheners", "hot water", "cold water"));
        topics.get(8).addQuestion(new Question("During a shave service, you should ___________.", "use gliding strokes with the point leading", "refrain from stretching the client's skin", "keep your fingers wet", "never shift your body position"));
        topics.get(8).addQuestion(new Question("To open the razor, grasp the ________ of the blade between the thumb and index finger.", "back", "edge", "front", "top"));
        topics.get(8).addQuestion(new Question("Observe the hair growth pattern and shave ____________it.", "with", "opposite", "around", "against"));
        topics.get(8).addQuestion(new Question("The application of __________ is a standard procedure in preparing the beard for shaving.", "hot towels", "pH-balanced toners", "pH-balanced fresheners", "cold lather"));
        topics.get(8).addQuestion(new Question("For a neck shave, you will tuck a neck strip or paper towel into the neckline of drape for ________.", "wiping the razor", "the client's comfort", "catching any loose hair", "drying the nape"));
        topics.get(8).addQuestion(new Question("Warped or loose handles may cause the blade to ___________ when closing the razor.", "pass through to the fingers", "separate by way of the pivot", "bend", "crack"));
        topics.get(8).addQuestion(new Question("For a beard redesign, what tool do you use to create a new guide starting in the center under the chin?", "Outliner", "Razor", "Clipper", "Haircutting shears"));
        topics.get(8).addQuestion(new Question("Trim the mustache to a desired length with________.", "an outliner", "scissors", "a straight razor", "haircutting shears"));
        topics.get(8).addQuestion(new Question("For a shave service, repeat the steaming process if the beard is ___________.", "extremely coarse", "curly", "very fine", "very long"));
        topics.get(8).addQuestion(new Question("______________ is when the client helps to stretch the skin by rolling his bottom lip slightly over his bottom teeth.", "Balling-the-chin", "Going against the grain", "Balling-the-lip", "Going with the grain"));
        topics.get(8).addQuestion(new Question("For a shave service, you should test the temperature of the hot towel with ______.", "your wrist", "your forearm", "the back of your hand", "the palm of your hand"));
        topics.get(8).addQuestion(new Question("How many degrees relative to the skin surface should you angle the razor?", "30 degrees.", "45 degrees.", "75 degrees.", "10 degrees."));
        topics.get(8).addQuestion(new Question("When performing a beard trim, gently comb through the beard and check for ________.", "hidden moles", "gray hair", "ingrown hair", "freckles"));
        topics.get(8).addQuestion(new Question("For beard designs on curly textured facial hair, you will trim excess hair using what technique?", "Cliper ower comb", "Outliner-over-comb", "Outliner-over-comb", "Shear-over-comb"));
        topics.get(8).addQuestion(new Question("For a shave service, apply a skin toner or other mild astringent to ____________.", "remove residual cream product", "warm the skin", "prevent nicks", "stretch the skin"));
        topics.get(8).addQuestion(new Question("Avoid ________ as the skin may be sensitive after the shave service.", "hot towels", "warm water", "moisturizing cream", "pH-balance toner"));
        topics.get(8).addQuestion(new Question("You should use strokes of how many inches to avoid shaving too far from the stretching point?", "1 to 3 inches.", "1 to 1 1/2 inches.", "1/2 to 1 inch.", "3 to 4 inches."));
        topics.get(8).addQuestion(new Question("Do not proceed with the service if the client has __________.", "a skin infection", "chapped skin", "sensitive skin", "a larger Adam's apple"));
        topics.get(8).addQuestion(new Question("With the holding position of the razor for the reverse backhand stroke, the elbow is positioned ____________.", "downward", "forward", "upward", "outward"));
        topics.get(8).addQuestion(new Question("You should keep the nondominant thumb and fingertips ____for stretching purposes.", "dry", "lathered", "damp", "moving"));
        topics.get(8).addQuestion(new Question("The shaving movement for a left-handed barber from left sideburn toward the jawbone and the angle of mouth is ______________.", "freehand and down", "reverse freehand and down", "reverse freehand and up", "backhand and down"));
        topics.get(8).addQuestion(new Question("The beard should be shaved _________.", "with the grain", "first against the grain, then with the grain", "against the grain", "across the grain"));
        topics.get(8).addQuestion(new Question("In which stroke will you use a few short scooping strokes to shave upward from the top of the chin toward the lower lip?", "Reverse-freehand", "Reverse-backhand", "Backhand", "Freehand"));
        topics.get(8).addQuestion(new Question("For a beard redesign, make sure the design line connects with the corners of the ____________.", "mustache outline", "ear lobes", "mouth", "sideburns"));
        topics.get(8).addQuestion(new Question("What type of stroke will you use around the mouth, over the ears, and in other tight areas?", "Shorter", "Reverse backhand", "Long", "Modified backhand"));
        topics.get(8).addQuestion(new Question("Which of the following refers to the way the razor is held in the barber's hand to perform a stroke movement?", "Direction", "Convention", "Relation", "Position"));
        topics.get(8).addQuestion(new Question("When finishing the shave service, apply light facial cream or moisturizing lotion with ____________movements.", "effleurage massage", "brisk", "pétrissage massage", "rotary"));
        topics.get(8).addQuestion(new Question("Do not perform a __________ immediately after a shave.", "deep cleansing facial", "hot towel application", "mustache trim", "beard trimming"));
        topics.get(8).addQuestion(new Question("Shaving strokes on the upper lip are performed ___________.", "on a slight diagonal", "vertically", "on a sharp diagonal", "horizontally"));
        topics.get(8).addQuestion(new Question("The term used to describe the correct angle of cutting with a razor is called the cutting _______.", "stroke", "position", "procedure", "movement"));
        topics.get(8).addQuestion(new Question("For a beard trim, work left and right of center to establish design line to the ___________.", "back of the jaws", "sideburns", "mustache outline", "corners of the mouth"));
        topics.get(8).addQuestion(new Question("The direction of hair growth creates the _______ of the hair.", "grain", "pattern", "length", "texture"));
        topics.get(8).addQuestion(new Question("For a shave service, you should keep the client's skin___________.", "hot", "dry", "moist", "steamed"));

        topics.get(9).addQuestion(new Question("What type of masks temporarily contract the skin pores?", "Clay", "Cream", "Paraffin wax", "Gel"));
        topics.get(9).addQuestion(new Question("The T-zone section of the face incorporates the forehead, nose, and __________.", "chin area", "eyes", "jaw area", "cheek area"));
        topics.get(9).addQuestion(new Question("When should steam be administered for a facial treatment?", "At the beginning", "In the middle", "Throughout", "At the end"));
        topics.get(9).addQuestion(new Question("Which of the following are a moist heat modality?", "Hot towels", "Heat lamps", "Heating caps", "Lasers"));
        topics.get(9).addQuestion(new Question("The immediate effect of massage is first noticed ____________.", "on the skin", "in blood circulation", "in the nerves", "in the muscles"));
        topics.get(9).addQuestion(new Question("Infrared rays generally produce a(n) __________ type of heat.", "soothing", "intense", "burning", "irritating"));
        topics.get(9).addQuestion(new Question("To perform desincrustation, what type of solution is applied to the skin's surface?", "Acid-based.", "Alkaline.", "Neutral.", "Moisturizing."));
        topics.get(9).addQuestion(new Question("Skin type is primarily based on the amount of ____ produced in the follicles.", "oil", "hair", "water", "lymph"));
        topics.get(9).addQuestion(new Question("What motor nerve controls chewing?", "Fifth cranial", "Accessory", "Seventh cranial", "Eleventh cranial"));
        topics.get(9).addQuestion(new Question("The high-frequency machine can benefit the client’s skin by________________.", "stimulating blood circulation", "decreasing cell metabolism", "deoxygenating the skin", "decreasing glandular activity"));
        topics.get(9).addQuestion(new Question("Cold causes muscles to __________.", "contract", "stretch", "relax", "expand"));
        topics.get(9).addQuestion(new Question("Another name for the eleventh cranial nerve is the __________ nerve.", "accessory", "trifacial", "trigeminal", "facial"));
        topics.get(9).addQuestion(new Question("What is often used to hold cream or gel masks in place over the skin?", "Gauze", "Paper towels", "Barber’s towel", "Cotton pads"));
        topics.get(9).addQuestion(new Question("Deep vibration with a mechanical vibrator or massager can __________.", "stimulate blood circulation", "promote beard growth", "reduce muscle tone", "inhibit oil production"));
        topics.get(9).addQuestion(new Question("What type of movements are the gentlest forms of tapotement?", "Tapping", "Hacking", "Chopping", "Slapping"));
        topics.get(9).addQuestion(new Question("Products with an alkaline pH are considered to be ___________.", "negative", "astringents", "slightly acidic", "positive"));
        topics.get(9).addQuestion(new Question("A benefit of a massage is that fat cells____________.", "are reduced", "are stimulated", "disappear", "are nourished"));
        topics.get(9).addQuestion(new Question("Which of the following is an electrical current modality?", "High frequency", "Electric massager", "LED", "Microdermabrasion"));
        topics.get(9).addQuestion(new Question("The effect of a facial service on a muscle can be calming or __________.", "stimulating", "cleansing", "softening", "contracting"));
        topics.get(9).addQuestion(new Question("A(n)___________ is any product, procedure, or treatment that should be avoided because it may cause undesirable side effects or be harmful to the individual.", "contraindication", "precaution", "condition", "indication"));
        topics.get(9).addQuestion(new Question("The electrodes for high-frequency machines are made of glass or __________.", "metal", "plastic", "hard rubber", "microcrystals"));
        topics.get(9).addQuestion(new Question("Overexposure to ____________ can destroy skin tissue.", "ultraviolet rays", "prescribed preparations", "moisturizers", "massage creams"));
        topics.get(9).addQuestion(new Question("What types of masks often contain humectants and emollients?", "Cream", "Clay", "Gel", "Paraffin wax"));
        topics.get(9).addQuestion(new Question("_______________loosen or dissolve dead-cell buildup on the skin surface.", "Chemical exfoliants", "Astringents", "Toners", "Masks"));
        topics.get(9).addQuestion(new Question("Maintenance and preservative care is the goal for what type of skin?", "Normal", "Combination", "Oily", "Dry"));
        topics.get(9).addQuestion(new Question("Common carotids are located at the _________.", "sides of the neck", "top of the head", "lower region of the face", "back of the head"));
        topics.get(9).addQuestion(new Question("Which muscles coordinate opening and closing the mouth?", "Masseter and temporalis.", "Auricularis superior and buccinator.", "Trapezius and triangularis", "Zygomaticus major and zygomaticus minor."));
        topics.get(9).addQuestion(new Question("Which of the following can be used to treat surface wrinkles and aging skin?", "Microdermabrasion", "Desincrustation", "Cataphoresis", "Anaphoresis"));
        topics.get(9).addQuestion(new Question("When using an electric massager, do not apply vibrations _____ as it may cause discomfort.", "over the upper lip", "on the scalp", "on the shoulders", "on the neck"));
        topics.get(9).addQuestion(new Question("PÃ©trissage exerts a(n) ________ effect on the area being massaged.", "invigorating", "relaxing", "antiseptic", "soothing"));
        topics.get(9).addQuestion(new Question("_________are fibrous tissues that have the ability to stretch and contract to produce body movement.", "Muscles", "Veins", "Arteries", "Nerves"));
        topics.get(9).addQuestion(new Question("Which of the following helps to rebalance the pH of the skin?", "Skin toners", "Chemical exfoliants", "Moisturizers.", "Masks"));
        topics.get(9).addQuestion(new Question("Which of the following muscles are in the neck?", "Platysma", "Procerus", "Corrugator", "Frontalis"));
        topics.get(9).addQuestion(new Question("High-frequency current is also known as _________ current.", "tesla", "cathode", "galvanic", "anode"));
        topics.get(9).addQuestion(new Question("Which method is used to perform desincrustation?", "Galvanic machine", "Vibrating", "Steaming", "Brushing"));
        topics.get(9).addQuestion(new Question("Ultraviolet lamps ________________.", "improve blood and lymph flow", "decrease melanin production", "assist the body in producing vitamin E", "decrease the elimination of waste products"));
        topics.get(9).addQuestion(new Question("What should a barber do if he or she recognizes that a client has a skin disease?", "Refer the client to a physician.", "Prescribe an over-the-counter remedy.", "Perform a medical diagnosis of the condition.", "Provide medical treatment."));
        topics.get(9).addQuestion(new Question("Cleansing lotions are ____________.", "water-based emulsions", "oil-based emulsions", "alcohol-based products", "cream-based products"));
        topics.get(9).addQuestion(new Question("Veins transport what type of blood from various parts of the body to the heart?", "Deoxygenated", "Dehydrated", "Oxygenated", "Exfoliated"));
        topics.get(9).addQuestion(new Question("Which of the following is a chemical modality?", "Microdermabrasion", "Microcurrent", "Lasers", "LED"));
        topics.get(9).addQuestion(new Question("What is caused by hardened masses of sebum formed inside a follicle?", "Comedones", "Dry skin", "Thin-textured skin", "Wrinkles"));
        topics.get(9).addQuestion(new Question("Germicidal benefits of high-frequency current can be produced with __________.", "direct application only", "both direct and indirect application", "neither direct nor indirect application", "indirect application only"));
        topics.get(9).addQuestion(new Question("For people with combination skin, the cheek and outer areas of the face tend to be ____________.", "dry", "oily", "greasy", "shiny"));
        topics.get(9).addQuestion(new Question("Astringents may contain up to what percentage of alcohol?", "35 percent", "4 percent", "20 percent", "15 percent"));
        topics.get(9).addQuestion(new Question("What type of modality are lasers?", "Heat.", "Electric current.", "Nerve impulse.", "Massage."));
        topics.get(9).addQuestion(new Question("A factor that influences the formation of wrinkles is________.", "excessive dryness of the skin", "excessive oiliness of the skin", "expanding of the skin tissue", "tightening of the elastic skin fibers"));
        topics.get(9).addQuestion(new Question("A __________ is a tender area in a muscle caused by a localized knot or spasm in the muscle fiber.", "trigger point", "motor point", "pressure point", "midpoint"));
        topics.get(9).addQuestion(new Question("Massage manipulations on the face are usually performed with what type of movements?", "Upward", "Hacking", "Downward", "Chopping"));
        topics.get(9).addQuestion(new Question("Which of the following is a chemical exfoliant?", "Enzyme peel", "Granular scrub", "Witch hazel", "Rolling cream"));
        topics.get(9).addQuestion(new Question("What type of products work best on combination skin types?", "Water-based", "Water-oil based", "Acid-based", "Oil-based"));
        topics.get(9).addQuestion(new Question("Hacking should only be used on the _____________.", "back and shoulders", "forehead", "face and neck", "scalp"));
        topics.get(9).addQuestion(new Question("How many pairs of cranial nerves are there?", "12", "6", "18", "24"));
        topics.get(9).addQuestion(new Question("The primary actions of high-frequency current are thermal and _______.", "antiseptic", "softening", "cleansing", "exfoliating"));
        topics.get(9).addQuestion(new Question("Cleansing creams are used primarily to _________________.", "dissolve dirt and makeup", "soften the skin", "rebalance the pH of the skin", "tighten the skin"));
        topics.get(9).addQuestion(new Question("Heat and moist heat on the skin causes____________.", "relaxation", "stimulation", "motion", "contraction"));
        topics.get(9).addQuestion(new Question("Which of the following is the most stimulating form of massage?", "Percussion", "PÃ©trissage", "Effleurage", "Friction"));
        topics.get(9).addQuestion(new Question("What muscle causes wrinkles across the forehead?", "Frontalis", "Epicranius", "Occipitalis", "Epicranial aponeurosis"));
        topics.get(9).addQuestion(new Question("___________ is a stroking movement.", "Effleurage", "Friction", "Petrissage", "Tapotement"));
        topics.get(9).addQuestion(new Question("Cervical nerves originate at the __________.", "spinal cord", "brain", "spinal column", "vertebrae"));
        topics.get(9).addQuestion(new Question("The motor nerve that controls motions of the neck muscles is the _________ nerve.", "accessory", "trifacial", "trigeminal", "facial"));
        topics.get(9).addQuestion(new Question("Which of the following is known as the facial artery?", "External maxillary", "Superficial temporal", "Posterior auricular", "Occipital"));
        topics.get(9).addQuestion(new Question("The sensory-motor nerve that controls motions of the face, scalp, and neck is the ________.", "seventh cranial nerve", "fifth cranial nerve", "trifacial nerve", "eleventh cranial nerve"));
        topics.get(9).addQuestion(new Question("Which of the following are vessels that transport oxygenated blood from the heart to all parts of the body?", "Arteries", "Veins", "Venules", "Capillaries"));
        topics.get(9).addQuestion(new Question("Microcurrent is a type of _________ treatment.", "galvanic", "brushing", "infrared", "UV"));
        topics.get(9).addQuestion(new Question("The basic facial is sometimes known as the ___________facial.", "scientific rest", "direct application", "vibratory", "indirect application"));
        topics.get(9).addQuestion(new Question("Total exposure time for infrared rays should not exceed __________.", "5 minutes", "1 hour", "10 minutes", "30 minutes"));
        topics.get(9).addQuestion(new Question("Which of the following would be the first skin care product to be used in a basic facial treatment?", "Cleansing cream or lotion", "Exfoliant", "Moisturizer", "Massage cream"));
        topics.get(9).addQuestion(new Question("You should perform massage manipulations systematically and _________.", "rhythmically", "equally", "gradually", "vertically"));
        topics.get(9).addQuestion(new Question("Which of the following is the muscle that surrounds the eye socket and closes the eyelid?", "Orbicularis oculi", "Occipitalis", "Procerus", "Corrugator"));
        topics.get(9).addQuestion(new Question("What is sometimes relieved through massage?", "Pain", "Acute skin inflammation.", "High blood pressure", "Skin infections."));
        topics.get(9).addQuestion(new Question("Rolling cream is not recommended for what type of skin?", "Dry", "Oily", "Normal", "Thick"));
        topics.get(9).addQuestion(new Question("In what massage movement are the skin and flesh grasped between the thumb and fingers?", "Petrissage", "Tapotement", "Vibration", "Effleurage"));
        topics.get(9).addQuestion(new Question("An infrared device is a type of ________modality.", "light ray", "nerve impulse", "electric current", "moist heat"));
        topics.get(9).addQuestion(new Question("What muscle is used for grinning?", "Risorius", "Zygomaticus minor", "Zygomaticus major", "Masseter"));
        topics.get(9).addQuestion(new Question("Oily skin is characterized by ___________.", "excess sebum production", "depressions in the skin", "not enough sebum production", "loosening of the elastic skin fibers"));
        topics.get(9).addQuestion(new Question("Which of the following masks absorbs sebum and is used on oily and combination skin types?", "Clay", "Cream", "Paraffin wax", "Gel"));
        topics.get(9).addQuestion(new Question("Which of the following is a form of mechanical exfoliation?", "Brushing", "Moisturizing", "Vibrating", "Steaming"));

        topics.get(10).addQuestion(new Question("What are the primary digits for stretching the skin?", "Thumb and second finger", "Middle and ring fingers", "Thumb and pinky", "Second and middle fingers"));
        topics.get(10).addQuestion(new Question("Why do we use an exfoliant?", "To remove dead cells from the skin", "To clean the skin", "To moisturize the skin", "To feed the skin"));
        topics.get(10).addQuestion(new Question("The T-zone is the section of the face that incorporates", "Forehead, nose, and chin area", "Forehead, eyes and nose", "Forehead and nose", "Nose and chin"));
        topics.get(10).addQuestion(new Question("What are complementary colors?", "Across from each other", "One after another", "Primary colors", "Base or tertiary colors"));
        topics.get(10).addQuestion(new Question("Do not use hot towels on skin that is", "Chapped or blistered", "Oily", "Normal", "With lots of blackheads"));
        topics.get(10).addQuestion(new Question("What is the level system used to analyze?", "Lightness or darkness of a color", "Porosity of a hair strand", "Texture of hair", "Length of hair"));
        topics.get(10).addQuestion(new Question("What is the highest level of decontamination?", "Sterilization", "Desinfection", "Sanitizing", "Cleaning"));
        topics.get(10).addQuestion(new Question("The buccinator is located between?", "Lower&Upper jaw ", "Eyebrows", "Upper jaw&nose", "Ear and neck"));
        topics.get(10).addQuestion(new Question("How do we clean a hone?", "Water & pumice stone to remove tiny steel material", "Water & soap", "Water & brush to remove dust and debris", "Brush & piece of cloth"));
        topics.get(10).addQuestion(new Question("What is a hone?", "Sharping block from rock or synthetic material", "Covering cloth", "Type of a straight razor", "Tone of color"));
        topics.get(10).addQuestion(new Question("When do you use a toner?", "After lightening", "Before lightening", "While making waves", "After service is done"));
        topics.get(10).addQuestion(new Question("How do barbers clean conventional straight razors?", "Clean, strop & little oil", "Clean, use pumice stone", "Clean and spray with oil", "Wipe & little oil"));
        topics.get(10).addQuestion(new Question("During a scalp massage what part of your hands do you use?", "The cushion of finger tips", "Nails", "Elbows", "Palms "));
        topics.get(10).addQuestion(new Question("Why do we drape?", "Protect clients’ skin and clothes", "Protect ourselves", "Protect furniture", "Protect client’s hair"));
        topics.get(10).addQuestion(new Question("If your client has skin abrasion", "Don’t proceed", "Patch it", "It’s ok, follow standard procedure", "Avoid only this area"));
        topics.get(10).addQuestion(new Question("What is the crust like clusters?", "Staphylococci", "Streptococci", "Non-pathogenic", "Spirilla"));
        topics.get(10).addQuestion(new Question("The ph in alkaline shampoo is …", "6.0", "4.5", "8.5", "12"));
        topics.get(10).addQuestion(new Question("When discussing Facial Treatments plans as well as products the Barbers must know?", "4 types of skin: oily, dry, normal, combination", "Texture of hair", "Porosity of hair", "Types of melanin"));
        topics.get(10).addQuestion(new Question("Based colors are composed from what?", "Primary and secondary colors", "Primary colors", "Secondary and tertiary colors", "Secondary colors"));
        topics.get(10).addQuestion(new Question("If hair is dry it’s due to the ", "Inactive sebaceous glands", "Lack of moisture", "High sensitivity", "Over-active sebaceous glands"));
        topics.get(10).addQuestion(new Question("What are the symptoms of tinea favosa?", "Dry, sulfur-yellow cuplike crust on the scalp", "hair loss involving the beard area", "hair loss, dry scaly areas, redness, and itch", "Patches of skin discoloration, usually on the back, chest, neck and upper arms, which may appear lighter or darker than usual"));
        topics.get(10).addQuestion(new Question("Tinea favosa means", "Dry, sulfur-yellow cuplike crust on the scalp (honey comb ringworm)", "hair loss, dry scaly areas, redness, and itch", "hair loss involving the beard area", "Patches of skin discoloration, usually on the back, chest, neck and upper arms, which may appear lighter or darker than usual"));
        topics.get(10).addQuestion(new Question("What is LED", "Light emitting diode", "Light escaping diode", "Luminous eliminating diode", "Luminous escaping diode"));
        topics.get(10).addQuestion(new Question("When applying virgin relaxer you first apply the relaxer in?", "Most resistant area or under the occipital bone", "No matter what area to start", "Least resistant area", "From frontal bone"));
        topics.get(10).addQuestion(new Question("When performing electrotherapy treatment the barber and the client must avoid contact with?", "Metals or water", "Skin", "Hair ", "Drape "));
        topics.get(10).addQuestion(new Question("If you have a client with broken skin what would you do", "Do not continue, refer to physician", "Avoid this broken area", "Patch it", "It’s ok, follow standard procedure"));
        topics.get(10).addQuestion(new Question("Staphylococci is pus forming bacteria that grows in", "Clusters like bunch of grapes", "Strings of beads", "Spirals", "Spherical pairs "));
        topics.get(10).addQuestion(new Question("When Your client has level 6 red violet and the client wants to be brown, what should you take?", "Yellow green", "Blue ", "Orange", "Violet-blue"));
        topics.get(10).addQuestion(new Question("The study of microorganisms is called?", "Bacteriology", "Histology", "Physiology", "Anatomy"));
        topics.get(10).addQuestion(new Question("Solutions that have a pH below 7.0 is", "Acid", "Base", "Alkaline", "Neutral"));
        topics.get(10).addQuestion(new Question("The pH in Balancing Shampoo is", "4.5-5.5", "6.0", "7.0-8.0", "2.5-3.5"));
        topics.get(10).addQuestion(new Question("Dry damage or over porous hair should be given?", "Reconditioning treatment", "Permanent haircoloring", "A haircut", "Regular service"));
        topics.get(10).addQuestion(new Question("What is the pH of temporary hair color?", "2.0-4.5", "4.5-5.5", "10.0", "8.5-9.5"));
        topics.get(10).addQuestion(new Question("Why do we recondition the hair?", "Moisturize, when hair is bridle, frizzy", "Feed the hair with vitamins", "Clean the hair from dirt", "Add some color to the tone"));
        topics.get(10).addQuestion(new Question("How do we drape for a facial massage?", "You drape the hair and body", "No need in draping", "Drape the hair only", "Drape the body only"));
        topics.get(10).addQuestion(new Question("What is steatoma?", "A sebaceous cyst", "Inflammation of sweat glands", "A bacterial boil", "Form of acne"));
        topics.get(10).addQuestion(new Question("What part of the scalp supplies and nutrients to the hair for growth?", "Dermal papilla", "Arrector pili muscle", "Hair cuticle", "Oil glands"));
        topics.get(10).addQuestion(new Question("The pH of conditioners is", "3.0-5.5", "4.0 to 6.0", "6.5 to 7.5", "8.5 to 9.0"));
        topics.get(10).addQuestion(new Question("What is used for coloring a moustache?", "Hair color crayons; pomades; liquid eyebrows and eyelash tints", "Permanent colors", "Toners ", "It’s not recommended to color"));
        topics.get(10).addQuestion(new Question("When performing sinusoidal facial massage what does it do?", "Improves muscle tone", "Purifies pores", "Makes skin looked dull", "Decrease blood flow"));
        topics.get(10).addQuestion(new Question("What is the best for long neck?", "Hair fuller at the nape", "Extremely short hair styles", "Curly hair", "Fringe "));
        topics.get(10).addQuestion(new Question("When shaving, the ball of the thumb and first two fingers are positioned on the flat side of the", "Shank", "The handle of the razor", "Blade", "Tang "));
        topics.get(10).addQuestion(new Question("Ask the client questions relating to the skin appearance and ", "Home care routine", "Dietary preferences", "Income", "Relationship status"));
        topics.get(10).addQuestion(new Question("The set of shears refers to the alignment of blades", "In relation to each other", "In relation to the pivot screw", "Between moving and still points", "To the finger brace"));
        topics.get(10).addQuestion(new Question("What type of hair color will lighten the hair?", "Permanent hair color", "Temporary hair color", "Semipermanent haircolor", "Demipermanent haircolor"));
        topics.get(10).addQuestion(new Question("Color position across from each other are", "Complimentary colors", "Opposite colors", "Primary colors", "Base or tertiary colors"));
        topics.get(10).addQuestion(new Question("When performing a head shave what is the first step?", "Lock the chair", "Drape the client", "Apply a hot towel", "Remove shampoo cap"));
        topics.get(10).addQuestion(new Question("The study of causes of diseases and their modes of operation", "Etiology ", "Physiology ", "Bacteriology", "Anatomy"));
        topics.get(10).addQuestion(new Question("Why do we apply protective cream?", "Prevent irritation", "Moisturize", "Clean", "Add color"));
        topics.get(10).addQuestion(new Question("What is the purpose of a shampoo?", "Cleanse the sculp and hair", "Moisturize scalp and hair", "Treat inflammation", "Add some relaxation to the client"));
        topics.get(10).addQuestion(new Question("Anthrax and tetanus bacilli form which type of spore? ", "Spherical ", "Mitosis", "Flagella ", " Infectious "));
        topics.get(10).addQuestion(new Question("All French style shears ", "have a finger brace. ", "are cobalt metal.", "are made in France. ", "have tight pivots. "));
        topics.get(10).addQuestion(new Question("Prior to a shaving service the headrest MUST be ", "disinfected and covered. ", "washed and dried. ", "washed and removed. ", "sanitized and sterilized. "));
        topics.get(10).addQuestion(new Question("To avoid damage to muscle tissue, the movements of a massage are directed ", "toward the origin of the muscle. ", "away from the origin of the muscle. ", "around the origin of the muscle. ", "above the origin of the muscle. "));
        topics.get(10).addQuestion(new Question("Which of the following can permanently relieve split ends? ", "Cutting the ends ", "Applying oil to the ends", "Using a styling gel on the ends", "Moistening the ends "));
        topics.get(10).addQuestion(new Question("The diameter of a single strand of hair is also called ", "texture. ", "growth pattern. ", "porosity. ", "density. "));
        topics.get(10).addQuestion(new Question("What should be performed FIRST before applying permanent haircolor? ", "Patch test ", "Strand test ", "Curl test ", "Texture test "));
        topics.get(10).addQuestion(new Question("Before sodium hydroxide processing, hair should be analyzed to determine its ", "texture, porosity, and elasticity. ", "density, color, and end bonds. ", "acidity. ", "alkalinity. "));
        topics.get(10).addQuestion(new Question("The aponeurosis tendon covers… / where is the aponeurosis located?", "Top of the head", "Back of the hand", "Forehead", "Front of the head"));









        return topics;
    }
    public int questionsLeft(){
        return topic.getSize();
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
            return topic.getQuestion();
        }
    }

    public void restore(){
        initializeQuestions();

    }

    private void initializeQuestions(){

        topics = setQuestions();
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
    private void initTopics(){
        topics = new ArrayList<>();
        mPrefs = mContext.getSharedPreferences("MyObject", MODE_PRIVATE);

        for (int i = 0; i < testNames.size(); i++) {
            String name = testNames.get(i);
            if (mPrefs.contains(name)) {
                Gson gson = new Gson();
                String json = mPrefs.getString(name, "error");
                if (json == "error"){
                    Log.d(TAG, "initTopics: SharedPreferences Error");
                }
                Topic topic = gson.fromJson(json, Topic.class);
                topics.add(topic);
            } else {
                initializeQuestions();
                Log.d(TAG, "initTopics: I = 0");
                i = 0;
            }
        }
    }
    public void saveData(){
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
    public void setTest(String name){
        topic = topics.get(testNames.indexOf(name));

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
            return !(topic.isEmpty());
        }
    }
    public ArrayList<Topic> getTopics(Context context){
        mContext = context;
        initTopics();
        return topics;
    }

    public Topic getTopic() {
        return topic;
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
