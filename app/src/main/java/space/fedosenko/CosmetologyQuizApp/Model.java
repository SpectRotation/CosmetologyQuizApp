package space.fedosenko.CosmetologyQuizApp;

import java.util.ArrayList;
import java.util.Random;

public class Model {
    private static Model instance = new Model();
    private ArrayList<Question> test1 = new ArrayList<>();
    private ArrayList<Question> test2 = new ArrayList<>();
    private ArrayList<Question> test3 = new ArrayList<>();
    private ArrayList<Question>  questions;
    private ArrayList<Question> wrongAnswers = new ArrayList<>();
    private boolean failedQuestions = false;
    private int testNumber;
    private String testName;
    private ArrayList<String> testNames = new ArrayList<>();


    private Model() {

        testNames.add("Wrong Answers");
        testNames.add("First Test");
        testNames.add("Infection Control");
        testNames.add("Anatomy and Physiology");

        setQuestions();
        questions = test1;
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }


    public void setQuestions() {
       test1.add(new  Question("Which of the following will reinforce and reconstruct the hair shaft?", "Protein conditioner", "Scalp treatment", " Balancing shampoo", "Hair brushing"));
       test1.add(new Question("When damaged, which of the following will cause the hair growth to be inhibited?", "Papilla", "Shaft", "Cuticle", "Arrector pili"));
       test1.add(new Question("A condition caused by an infestation of head lice is", "pediculous capitalis", "tinea barbae", "scabies", "tinea capitis"));
       test1.add(new Question("Debris is removed from tools and implements using which of the following procedures?", "Cleaning", "Disinfection", "Sterilization", "Decontamination"));
       test1.add(new Question("What implement adds shine and smooths wavy ridges on the natural nail during a manicure?", "Nail buffer", "Coarse file", "Metal file", "Nail brush"));
       test1.add(new Question("What is another name for the dermis layer of the skin?", "True skin", "Basal cell", "Spiny layer", "Horny layer"));
       test1.add(new Question("The massage movement intended to soothe muscles is", "effleurage", "petrissage", "tapotement", "friction"));
       test1.add(new Question("What product can be used to equalize the porosity of the hair?", "Fillers", "Shampoo", "Lightener", "Developer"));
       test1.add(new Question("Anthrax and tetanus bacilli form which type of spore? ", "Spherical", "Mitosis", "Flagella", "Infectious"));
       test1.add( new Question("All French style shears", "have a finger brace", "are cobalt metal", "are made in France", "have tight pivots"));
       test1.add( new Question("Prior to a shaving service the headrest MUST be", "disinfected and covered", "washed and dried", "washed and removed", "sanitized and sterilized"));
       test1.add( new Question("To avoid damage to muscle tissue, the movements of a massage are directed ", "toward the origin of the muscle", "away from the origin of the muscle", "around the origin of the muscle", "above the origin of the muscle"));
       test1.add( new Question("Which of the following can permanently relieve split ends?", "Cutting the end", "Applying oil to the ends", "Using a styling gel on the ends ", "Moistening the ends "));
       test1.add( new Question("The diameter of a single strand of hair is also called ", "texture", "growth pattern", "porosity", "density"));
       test1.add( new Question("What should be performed FIRST before applying permanent haircolor?", "Patch test", "Strand test ", "Curl test", "Texture test"));
       test1.add( new Question("Before sodium hydroxide processing, hair should be analyzed to determine its ", "texture, porosity, and elasticity", "acidity", "alkalinity", "density, color, and end bonds"));
       test1.add( new Question("What is the term for the scientific study of the skin? ", "Dermatology", "Myology", "Angiology ", "Physiology "));
       test1.add( new Question("A product containing antiseptic reaches what level of decontamination? ", "Sanitation", "Disinfection", "Sterilization ", "Ionization"));
       test1.add( new Question("Which of the following is also referred to as the basal layer? ", "Stratum germinativum", "Stratum granulosum ", "Stratum lucidum", "Stratum corneum "));
       test1.add( new Question("During the anagen phase of hair growth, the hair is ", "actively growing", "beginning to destroy itself", "shedding", "disconnecting from the papilla"));
       test1.add( new Question("A new client schedules for a series of chemical exfoliation treatments. When should the consultation form be reviewed and signed?", "At each treatment ", "Monthly", "Annually ", "At the first treatment "));
       test1.add( new Question("Dilated capillaries that can be seen beneath the surface of the skin are known as ", "telangectasia", "seborrhea", "keratoma", " dehydrated"));
       test1.add( new Question("Melanocytes that are more active will produce ", "darker skin", "lighter skin", "sebaceous skin", "dry skin"));
       test1.add( new Question("In addition to softening sebum, another function of a facial steamer is to", "oxygenate the skin", "moisturize the skin", "decrease circulation", "detoxify the skin"));
       test1.add( new Question("Pumice stone is used in pedicuring as ", "an abrasive", "a bleach", "a lubricant", "an astringent"));
       test1.add( new Question("What is the FIRST step in performing a manicure? ", "Remove old polish ", "Shape the nails", "Soften the cuticles", "Clean under free edge "));
       test1.add( new Question("Where should all manicuring cosmetic supplies be kept when not being used? ", "In clean, closed containers ", "On a clean shelf", "On the manicuring table", "In a clean manicuring kit "));
       test1.add( new Question("Which one of the following is a condition in which the cuticle splits around the nail? ", "Hangnails ", "Pterygium", "Onychophagy ", "Onychorrhexis "));
       test1.add( new Question("Nerves and blood vessels are found in the nail ", "bed", "wall", "plate", "grooves"));
       test1.add( new Question("An antiseptic is used in manicuring to ", "treat minor cuts", "bleach the nails.", "smooth corrugated nails", "give the nails a high sheen"));
       test1.add( new Question("After each use, manicuring implements should be ", "cleansed and disinfected", "wiped with a towel", "wiped with a tissue", "placed in dry storage"));
       test1.add( new Question("For which one of the following are oil manicures recommended? ", "Brittle nails", "Leuconychia ", "Split nails ", "Prevention of infection "));
       test1.add( new Question("What is the actively growing part of the nail? ", "Matrix ", "Lunula", "Mantle", "Free edge "));
       test1.add( new Question("What should be applied to a split in the nail before wrapping it?", "Adhesive glue", "Top coat", "Base coat ", "Nail hardener"));
       test1.add( new Question("Disease producing bacteria are called ", "pathogenic", "hyperemia", "hypoallergenic", "nonpathogenic"));
       test1.add( new Question("Which of the following would result in the greatest production of lye?", "Increase both current and time", "Decrease both current and time", "Increase current and decrease time ", "Decrease current and increase time "));
       test1.add( new Question("Hair grows from the papilla by multiplication of the ", "matrix cells", "stratum lucidum", "papillary layer", "reticular region"));
       test1.add( new Question("What temporary method of hair removal accelerates the shedding of the horny layer of the skin?", "Depilatory", "Bleaching", "Threading", "Clipping"));
       test1.add( new Question("Electrolysis is recognized as the only proven method of permanent hair removal by the ", "Food and Drug Administration (FDA)", "Environmental Protection Agency (EPA", "Centers for Disease Control (CDC)", "Occupational Safety and Health Administration (OSHA)"));


        test2.add(new  Question("Barbering tools and implements are designed for specific _____________.", "purposes", "barbers", "environments", "clients"));
        test2.add(new  Question("_____________ may contain antirust ingredients.", "Quat solutions", "Phenol", "Petroleum distillates", "Bleach"));
        test2.add(new  Question("Never mix ___________ together under any circumstances.", "cleaning products", "sawdust and chemicals", "water and shaving cream", "shampoos"));
        test2.add(new  Question("Clothing should be___________.", "comfortable", "excessively baggy", "loose", "tight"));
        test2.add(new  Question("_________ is a mechanical process (scrubbing) using soap and water or detergent and water.", "Cleaning", "Sanitizing", "Disinfection", "Sterilization"));
        test2.add(new  Question("Tuberculocidal disinfectants are often referred to as_________.", "phenolics", "wet sanitizers", "quats", "statutes"));
        test2.add(new  Question("Which of the following is the most powerful and important way to prevent the spread of infection?", "Handwashing.", "Use of heat.", "Use of an autoclave.", "Use of EPA-registered disinfectant."));
        test2.add(new  Question("Where should you test the water temperature before applying to a client’s hair or scalp?", "Inside of your wrist.", "Back of your hand.", "Palm of your hand.", "Your fingers."));
        test2.add(new  Question("Water heaters should not be set at higher than what temperature?", "130 degrees Fahrenheit.", "200 degrees Fahrenheit.", "175 degrees Fahrenheit.", "150 degrees Fahrenheit."));
        test2.add(new  Question("Which of the following does not spread the HIV virus?", "Sharing food.", "Sharing of needles.", "Contact with cuts and sores.", "Unprotected sexual contact."));
        test2.add(new  Question("Disinfectants must be registered with the ___________.", "EPA", "OSHA", "SDS", "HCS"));
        test2.add(new  Question("The majority of contaminants and pathogens can be removed from the surfaces of tools and implements through proper __________.", "cleaning", "mixing of disinfectants", "handwashing", "guidelines"));
        test2.add(new  Question("If you spill water while working at the shampoo bowl, you should __________.", "clean it up immediately", "let it dry on its own", "ask someone nearby to clean it up", "clean it up after the client leaves"));
        test2.add(new  Question("Lyme disease is caused by what type of bacteria?", "Spirilla.", "Bacilli.", "Diplococci.", "Staphylococci."));
        test2.add(new  Question("Which bacteria cause MRSA?", "Staphylococci.", "Spirilla.", "Streptococci.", "Diplococci."));
        test2.add(new  Question("What disease breaks down the body’s immune system?", "AIDS.", "MRSA.", "Hepatitis A.", "Hepatitis C."));
        test2.add(new  Question("__________ that stems from a knowledgeable and caring manner is what separates a true professional from a nonprofessional.", "Behavior", "Income", "Clothing", "Legal responsibility"));
        test2.add(new  Question("Laws are also called ___________.", "statutes", "regulations", "rules", "guidelines"));
        test2.add(new  Question("What should you use to cushion the client’s neck at the shampoo bowl?", "Folded towel.", "Neck strip.", "Cape.", "Pillow."));
        test2.add(new  Question("The EPA registers all types of __________ sold and used in the United States.", "disinfectants", "bacteria", "fungi", "viruses"));
        test2.add(new  Question("Due to the drying effect of alcohol, hand sanitizers should not be _________.", "overused", "cleaners", "diluted", "used as an antiseptic"));
        test2.add(new  Question("What type of disinfectant is a form of formaldehyde?", "Phenolics.", "Petroleum distillates.", "Bleach.", "Quaternary ammonium compounds."));
        test2.add(new  Question("It is your legal responsibility to keep your ____________ current.", "license", "clients", "shoes", "jewelry"));
        test2.add(new  Question("The body prevents and controls infections through__________.", "uncompromised skin", "weakened tissue", "broken skin", "unprotected sex"));
        test2.add(new  Question("It is the barber's responsibility to _________.", "be aware of changes to rules and regulations", "recommend changes to rules and regulations", "keep regulatory agencies informed about changes to regulations", "decide what constitutes legal standards of conduct"));
        test2.add(new  Question("Where are disinfecting jars usually placed?", "On the station countertop.", "Under a cabinet.", "On a shelf.", "Attached to a wall."));
        test2.add(new  Question("__________is the process that destroys all microbial life, including spores.", "Sterilization", "Sanitizing", "Cleaning", "Disinfection"));
        test2.add(new  Question("The CDC requires that autoclaves be tested weekly to ensure they are properly sterilizing implements, using a _________test.", "spore", "performance", "bacterial", "viral"));
        test2.add(new  Question("Do not allow children to play ___________.", "on the hydraulic chairs", "on the waiting room chairs", "on the floor", "in the reception area"));
        test2.add(new  Question("Effective sterilization typically requires the use of a(n)_________.", "autoclave", "multiuse tool", "hospital disinfectant", "UV light unit"));
        test2.add(new  Question("On a Safety Data Sheet, toxicology information would include which of the following?", "Routes of exposure.", "Chemical stability.", "Disposal techniques.", "Chemical characteristics."));
        test2.add(new  Question("Never take ___________ for cleaning and disinfecting.", "shortcuts", "more than a few minutes", "legal responsibility", "preventative measures"));
        test2.add(new  Question("Never overload electrical outlets or use ____________.", "extension cords", "electric latherizers", "GFCI outlets", "electrical cords"));
        test2.add(new  Question("OSHA was created as part of the ___________.", "U.S. Department of Labor", "United Nations", "state barber boards", "EPA"));
        test2.add(new  Question("When cutting a child’s hair, try to anticipate the child’s __________.", "sudden moves", "moods", "inquisitive nature", "hairstyle choice"));
        test2.add(new  Question("Alcohol should only be used as a cleaner or ____________.", "antiseptic", "sterilizer", "disinfectant", "bleach"));
        test2.add(new  Question("What type of disinfectant is similar in chemical structure to kerosene?", "Petroleum distillates", "Phenolic disinfectants", "Bleach", "Quats"));
        test2.add(new  Question("Who should be instructed in fire extinguisher use?", "All employees.", "The clients.", "Only the receptionist.", "Only the barbers."));
        test2.add(new  Question("__________ should not be used to disinfect or sterilize implements.", "Baby sterilizers", "Disinfectant containers", "Bleach", "Autoclaves"));
        test2.add(new  Question("It is important to wear __________ and gloves while disinfecting nonelectrical tools.", "safety glasses", "a cape", "earplugs", "an apron"));
        test2.add(new  Question("Cocci are generally transmitted in ___________.", "the air", "semen", "spores", "water"));
        test2.add(new  Question("The second step of infection control is __________.", "disinfection", "cleaning", "sterilization", "sanitation"));
        test2.add(new  Question("When a disease spreads from one person to another, the disease is said to be a(n)_______.", "contagious disease", "inflammation", "systemic infection", "local infection"));
        test2.add(new  Question("Disinfection is not effective against ___________.", "bacterial spores", "mold", "fungi", "viruses"));
        test2.add(new  Question("Staphylococci grow in what shape?", "Clusters, like bunches of grapes.", "Rod.", "Corkscrew.", "Pairs."));
        test2.add(new  Question("An autoclave is a piece of equipment that incorporates heat and________.", "pressure", "quaternary ammonium compounds", "phenolics", "chemicals"));
        test2.add(new  Question("Every solution, liquid, cream, powder, paste, gel, and other substance should be properly ___________.", "labeled", "cleaned", "disinfected", "diluted"));
        test2.add(new  Question("An EPA registration number certifies that a disinfectant _____________.", "is effective against the pathogens listed on the label", "has an appropriate water content for commercial use", "does not need to be mixed prior to application", "will destroy all known pathogens"));
        test2.add(new  Question("Hydrogen peroxide works well as an antiseptic at what percentage of strength?", "3 percent.", "5 percent.", "25 percent.", "10 percent."));
        test2.add(new  Question("The invasion of body tissues by disease-causing pathogens is called a(n)______.", "infection", "toxin", "immunity", "disease"));
        test2.add(new  Question("Hepatitis can live on a surface outside the body for__________.", "long periods of time", "only the contact time", "short periods of time", "approximately 10 minutes"));
        test2.add(new  Question("What bloodborne virus can damage the liver?", "Hepatitis.", "HIV.", "AIDS.", "MRSA."));
        test2.add(new  Question("State regulatory agencies include ___________.", "the EPA", "OSHA", "hospitals", "health departments"));
        test2.add(new  Question("If you accidentally cut a client, what should you do first?", "Stop the service immediately.", "Wash your hands.", "Calmly apologize.", "Apply slight pressure to the area."));
        test2.add(new  Question("You should never mix __________.", "detergents and bleach", "detergents and water", "bleach and water", "concentrated disinfectants and water"));
        test2.add(new  Question("State agencies regulate____________.", "licensing", "chemical ingredients", "use of equipment", "manufacturing of equipment"));
        test2.add(new  Question("Disinfectants are a type of ___________.", "poison", "nutrient", "residue", "immunity"));
        test2.add(new  Question("Fumes from chemical applications and nail care products require filtration units that cleanse and ____________ the air.", "detoxify", "disinfect", "cool", "heat"));
        test2.add(new  Question("Do not try to________ tools yourself.", "repair", "purchase", "disinfect", "clean"));
        test2.add(new  Question("Rings should not be worn on the _________,as they might interfere with haircutting accuracy.", "index fingers", "pinky fingers", "thumbs", "ring fingers"));
        test2.add(new  Question("In the barbershop, the spread of bloodborne pathogens is possible during _________.", "haircutting", "brushing", "shampooing", "blowdrying"));
        test2.add(new  Question("What type of hepatitis is the most difficult to kill on a surface?", "Hepatitis B.", "Hepatitis A.", "Hepatitis C.", "Hepatitis E."));
        test2.add(new  Question("Fire extinguishers should be placed where they are________.", "readily accessible", "away from clients", "locked in a safe place", "near ventilation"));
        test2.add(new  Question("How long should an item remain submerged in the disinfectant?", "10 minutes.", "20 minutes.", "60 minutes.", "2 minutes."));
        test2.add(new  Question("Bacteria with flagella move in what type of motion?", "Snakelike.", "Rowing-like.", "Vertical.", "Sudden."));
        test2.add(new  Question("Disinfectants can be safely applied to __________.", "non-porous surfaces", "nails", "skin", "hair"));
        test2.add(new  Question("You should be prepared for ____________.", "emergencies", "unattended children", "tool repair", "non-professionalism"));
        test2.add(new  Question("Staphylococci cause which of the following?", "Boils.", "Blood poisoning.", "Tetanus.", "Pneumonia."));
        test2.add(new  Question("Which of the following is an example of a bloodborne virus?", "HIV.", "Cystic fibrosis.", "Otitis media.", "Conjunctivitis."));
        test2.add(new  Question("When cutting a child’s hair, hold the child’s head ___________.", "gently but firmly", "at the nape of the neck", "loosely", "with force"));
        test2.add(new  Question("Petroleum distillates are excellent at removing __________ from metals.", "oils", "spores", "discoloration", "scratches"));
        test2.add(new  Question("Assist clients (especially ________) in and out of hydraulic and shampoo chairs.", "the elderly", "men", "teenagers", "women"));
        test2.add(new  Question("Which of the following can grow in bar soaps?", "Bacteria.", "Mold.", "Fungi.", "Viruses."));
        test2.add(new  Question("Bacteria multiply best in what type of places?", "Warm.", "Cold.", "Dry.", "Clean."));
        test2.add(new  Question("When working at the shampoo bowl, you should avoid __________.", "twisting your waist", "holding your shoulders level", "balancing your neck over your shoulders", "keeping your back straight"));
        test2.add(new  Question("Federal and state laws require that manufacturers supply a Safety Data Sheet for all ________ products manufactured and sold.", "chemical", "mechanical", "commercial", "electrical"));
        test2.add(new  Question("Keep hair pulled back or short enough to avoid ____________.", "entanglements", "skin irritations", "getting wet", "dirt buildup"));
        test2.add(new  Question("Bleach solution should be stored ____________.", "away from heat and light", "away from other solutions", "somewhere damp", "near heat and light"));
        test2.add(new  Question("Phenolics are known _________.", "carcinogens", "pathogens", "contaminants", "allergens"));
        test2.add(new  Question("_________ is the ability to produce the intended effect.", "Efficacy", "Concentration", "Contact time", "Accuracy"));
        test2.add(new  Question("__________are used only for storage of disinfected items.", "UV light units", "Workstations", "Store rooms", "Reception areas"));
        test2.add(new  Question("What should you wear when pouring or mixing products?", "Goggles.", "Apron.", "White coat.", "Nonskid shoes."));
        test2.add(new  Question("Your most important responsibility is to _____________.", "protect your clients’ health and safety", "recommend products", "know a chemical’s characteristics", "know federal and state manufacturing laws"));
        test2.add(new  Question("___________ will not disinfect or sterilize implements.", "UV light units", "Bleach", "Phenolics", "Autoclaves"));
        test2.add(new  Question("A(n)________is contact with nonintact skin, blood, body fluid, or other potentially infectious materials.", "exposure incident", "communicable incident", "precautionary incident", "accident"));
        test2.add(new  Question("If a tool or implement is dropped on the floor during a service, it must be replaced with a ___________tool.", "disinfected", "cleaned", "sterilized", "contaminated"));
        test2.add(new  Question("Never place any tool or implement in your ___________.", "pocket", "workstation", "countertop receptacles", "disinfecting jar"));
        test2.add(new  Question("Blood may carry dangerous _________, so you should never touch an open sore or a wound.", "pathogens", "nonpathogens", "allergens", "nutrients"));
        test2.add(new  Question("Strict __________ practices should be used with all clients.", "infection control", "emergency", "surgical", "first-aid"));
        test2.add(new  Question("Showing no symptoms or signs of infection is considered being _________.", "asymptomatic", "communicable", "contagious", "symptomatic"));
        test2.add(new  Question("The presence of _________ is a sign of a bacterial infection.", "pus", "spores", "blood", "oiliness"));

        test3.add(new  Question("What scalp muscle causes wrinkles across the forehead?", "Frontalis", "Epicranius", "Epicranial aponeurosis", "Occipitalis"));
        test3.add(new  Question("What muscle in the chest assists with breathing?", "Serratus anterior", "Pectoralis minor", "Bicep", "Pectoralis major"));
        test3.add(new  Question("What nervous system in the body includes the brain?", "Central nervous system.", "Autonomic nervous system.", "Somatic nervous system.", "Peripheral nervous system."));
        test3.add(new  Question("An example of an endocrine gland would be a(n) __________ gland.", "pituitary", "sweat", "oil", "duct"));
        test3.add(new  Question("An example of connective tissue would be__________.", "lymph", "neurons", "glands", "the lining of the heart"));
        test3.add(new  Question("The word ending -ology means ___________.", "“study of”", "“part of”", "“science of”", "“map of”"));
        test3.add(new  Question("Where do the cervical or spinal nerves originate?", "Spinal cord", "Brain", "Vertebrae", "Spinal column"));
        test3.add(new  Question("What type of glands release hormonal secretions directly into the bloodstream?", "Endocrine", "Oil", "Exocrine", "Duct"));
        test3.add(new  Question("What color is blood in the veins?", "Dark red", "Light pink", "Bright red", "Dark pink"));
        test3.add(new  Question("What artery supplies blood to the forehead?", "Frontal", "Transverse facial", "Middle temporal", "Submental"));
        test3.add(new  Question("The cell membrane is the cell wall that encloses the ________.", "protoplasm", "yolk", "cytoplasm", "nucleus"));
        test3.add(new  Question("What body system destroys disease-causing microorganisms?", "Lymphatic/immune", "Integumentary", "Excretory", "Circulatory"));
        test3.add(new  Question("What part of a cell is needed for growth, reproduction, and self-repair?", "The cytoplasm.", "The nucleus.", "The cell membrane.", "The protoplasm."));
        test3.add(new  Question("What hormone is primarily present in females?", "Estrogen", "Insulin", "Adrenaline", "Testosterone"));
        test3.add(new  Question("The ________ system helps to regulate the body’s temperature.", "integumentary", "circulatory", "muscular", "endocrine"));
        test3.add(new  Question("How many bones are in the body?", "206", "230", "140", "120"));
        test3.add(new  Question("An oval, bony case that protects the brain is the _________.", "cranium", "maxillae", "thorax", "mandible"));
        test3.add(new  Question("Which of the following bring nutrients to the cells and carry away waste materials?", "Capillaries", "Venules", "Arterioles", "Arteries"));
        test3.add(new  Question("In the hand, ____________ draw the fingers together.", "adductors", "abductors", "extensors", "pronators"));
        test3.add(new  Question("The muscular system functions to_____________.", "help produce movement within the body", "carry impulses from the central nervous system", "transport blood to and from the heart", "help produce both white and red blood cells"));
        test3.add(new  Question("What U-shaped bone(s) is located at the base of tongue?", "Hyoid", "Phalanges", "Thorax", "Zygomatic"));
        test3.add(new  Question("Which of the following helps carry wastes and impurities away from the cells before it is routed back to the circulatory system?", "Lymph", "Blood", "Interstitial fluid", "Water"));
        test3.add(new  Question("A normal adult heart beats about how many times per minute?", "60 to 80", "100 to 110", "90 to 120", "40 to 50"));
        test3.add(new  Question("What is the largest organ of the body?", "the skin", "the lungs", "the heart", "the brain"));
        test3.add(new  Question("What muscle would you be using if you were grinning?", "Risorius", "Depressor labii inferioris", "Zygomaticus major", "Levator labii superioris"));
        test3.add(new  Question("Reflexes do not have to be learned because they are _________.", "automatic", "superficial", "voluntary", "permanent"));
        test3.add(new  Question("What does the word integument mean?", "Natural covering", "Map", "Bone", "Study of"));
        test3.add(new  Question("What body system provides a suitable fluid environment for the cells?", "Lymphatic/immune", "Circulatory", "Integumentary", "Endocrine"));
        test3.add(new  Question("Facial hair growth and color is a result of_____________.", "changing or fluctuating hormones", "a lack of immunities", "inflammation of the tissue", "body temperature"));
        test3.add(new  Question("One of the functions of bone marrow is to produce_________.", "white and red blood cells", "hormones", "minerals", "movement within the body"));
        test3.add(new  Question("Motor nerves carry impulses from the brain to the _________.", "muscles", "skin", "brain", "nose"));
        test3.add(new  Question("An example of a hormone is __________.", "estrogen", "blood", "oil", "sweat"));
        test3.add(new  Question("What artery supplies blood to the brain?", "Internal carotid", "External carotid", "Submental", "Facial"));
        test3.add(new  Question("A(n) ___________ is the primary structural unit of the nervous system.", "neuron", "axon", "dendrite", "axon terminal"));
        test3.add(new  Question("Which of the following is the largest and most complex organization of nerve tissue?", "Brain.", "Cranial nerves.", "Spinal nerves.", "Spinal cord."));
        test3.add(new  Question("Which of the following is the chief sensory nerve of the face?", "Trifacial nerve.", "Mental nerve.", "Mandibular nerve.", "Maxillary nerve."));
        test3.add(new  Question("What type of tissue is bone composed of?", "Connective", "Nerve", "Muscle", "Epithelial"));
        test3.add(new  Question("The seventh cranial nerve is also known as the_______nerve.", "facial", "trigeminal", "accessory", "trifacial"));
        test3.add(new  Question("__________ are thick-walled, muscular, flexible tubes.", "Arteries", "Venules", "Arterioles", "Capillaries"));
        test3.add(new  Question("________ tissue is a technical term for fat.", "Adipose", "Nerve", "Epithelial", "Muscle"));
        test3.add(new  Question("Which of the following is the largest bone of the arm?", "Humerus", "Ulna", "Carpus", "Radius"));
        test3.add(new  Question("The ______ bone joins all of the bones of the cranium together.", "sphenoid", "frontal", "ethmoid", "zygomatic"));
        test3.add(new  Question("The orbicularis oculi muscle_______________.", "enables you to close your eyes", "can easily be damaged during makeup application", "wrinkles the forehead vertically", "draws the eyebrows down"));
        test3.add(new  Question("What body system controls and coordinates the functions of all the other systems?", "Nervous", "Muscular", "Circulatory", "Endocrine"));
        test3.add(new  Question("A _______ is the connection between two or more bones of the skeleton.", "joint", "ligament", "tendon", "muscle"));
        test3.add(new  Question("One of the functions of the lymphatic/immune system is to__________.", "act as a defense against toxins and bacteria", "pass on the genetic code", "stimulate functional activity", "supply oxygen and eliminate carbon dioxide"));
        test3.add(new  Question("The lymphatic/immune system is closely connected to what other body system?", "Cardiovascular", "Nervous", "Reproductive", "Endocrine"));
        test3.add(new  Question("The largest artery in the body is the _______.", "aorta", "temporal", "carotid", "facial"));
        test3.add(new  Question("The middle part of a muscle is called the____________.", "belly", "nuclei", "origin", "insertion"));
        test3.add(new  Question("_________ is the science of the structure of organisms or of their parts.", "Anatomy", "Osteology", "Physiology", "Histology"));
        test3.add(new  Question("__________ is the study of the structure, functioning, and diseases of the muscles.", "Myology", "Histology", "Physiology", "Osteology"));
        test3.add(new  Question("Keeping the wrist in what position will help to prevent injuries?", "Straight", "Locked", "Bent", "Flexed"));
        test3.add(new  Question("What percentage of blood is water?", "80 percent", "50 percent", "25 percent", "63 percent"));
        test3.add(new  Question("The muscular system comprises what percentage of the body’s weight?", "40 to 50 percent", "80 percent", "25 percent", "15 to 20 percent"));
        test3.add(new  Question("What type of muscle is not duplicated anywhere else in the body?", "Cardiac", "Nonstriated", "Voluntary", "Smooth"));
        test3.add(new  Question("Nonstriated muscles are found where in the body?", "Intestines", "Hands", "Face", "Heart"));
        test3.add(new  Question("The _____________ circulation system takes deoxygenated blood to the lungs for oxygenation and waste removal and then returns that blood to the heart.", "pulmonary", "general", "cardiovascular", "systemic"));
        test3.add(new  Question("Lymph nodes filter the lymphatic vessels, which helps __________.", "fight infection", "produce both white and red blood cells", "regulate the body’s temperature", "body movement"));
        test3.add(new  Question("What type of tissue is found on the inside of the mouth?", "Epithelial", "Muscle", "Nerve", "Connective"));
        test3.add(new  Question("What body system stores most of the body’s calcium supply?", "Skeletal", "Respiratory", "Circulatory", "Endocrine"));
        test3.add(new  Question("____________ is blood plasma found in the spaces between tissue cells.", "Interstitial fluid", "Cytoplasm", "Lymph", "Nutritive fluid"));
        test3.add(new  Question("The basic units of all living things are __________.", "cells", "bacteria", "cytoplasm", "protoplasm"));
        test3.add(new  Question("Striated muscles are controlled by __________.", "will", "involuntary actions", "the five senses", "impulses"));
        test3.add(new  Question("Which of the following is the process of cell reproduction when the cell divides into two identical cells?", "Mitosis", "Adipose", "Aponeurosis", "Metabolism"));


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
    public void setTest(int number){
        setQuestions();
        if (number == 0&&testNumber!=0){
            questions = wrongAnswers;
            testNumber = 0;
            setWrongAnswersMode();

        } else if (number == 1&&testNumber!=1){
            questions = test1;
            testNumber = 1;
            setNormalAnswersMode();

        } else if (number == 2&&testNumber!=2){
            questions = test2;
            testNumber = 2;
            setNormalAnswersMode();
        } else if (number == 3&&testNumber!=3){
            questions = test3;
            testNumber = 3;
            setNormalAnswersMode();
        }
        testName = testNames.get(testNumber);
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
