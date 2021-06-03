package space.fedosenko.CosmetologyQuizApp;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Random;

import static android.content.Context.MODE_PRIVATE;

public class Model {
    private static Model instance;
    private Context mContext;

    private Topic topic;
    private ArrayList<Question>  questions;
    private ArrayList<Question> wrongAnswers = new ArrayList<>();
    private boolean failedQuestions = false;
    private int testNumber;
    private String testName;
    private ArrayList<String> testNames = new ArrayList<>();
    private SharedPreferences  mPrefs;
    private ArrayList<Topic> topics;
    private Model() {

        testNames.add("Infection Control");
        testNames.add("Anatomy and Physiology");
        testNames.add("Skin Structure, Disorders, and Disease");
        testNames.add("Properties and Disorders of the Hair");
        testNames.add("Basics of Chemistry");
        testNames.add("Implements, Tools, and Equipment");
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
        if (mPrefs == null){
            initializeQuestions();
            return;
        }
        for (int i = 0; i < testNames.size(); i++) {
            String name = testNames.get(i);
            if (!mPrefs.contains(name)){
                initializeQuestions();
                return;
            }
            Gson gson = new Gson();
            String json = mPrefs.getString(name, "error");
            topic = gson.fromJson(json, Topic.class);
            topics.add(topic);
        }


    }
    public void setTest(String name){
        topic = topics.get(testNames.indexOf(name));
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
    public ArrayList<Topic> getTopics(Context context){
        mContext = context;
        initTopics();
        return topics;
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
