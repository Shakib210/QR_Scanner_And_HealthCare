package com.example.cardview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ExpandableListData {

    public static HashMap<String, List<String>> getData() {

        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Blood = new ArrayList<String>();

        Blood.add("Coughing or chest pain");
        Blood.add("Fever or chills");
        Blood.add("Frequent infections");
        Blood.add("Itchy skin or rash");
        Blood.add("Night sweats");
        Blood.add("Persistent weakness and fatigue");


        List<String> breast = new ArrayList<String>();

        breast.add("A lump or mass in the breast.");
        breast.add("Irritated or itchy breasts");
        breast.add("Change in breast color");
        breast.add("Increase in breast size or shape ");
        breast.add("Changes in touch");
        breast.add("Peeling or flaking of the nipple skin");
        breast.add("A breast lump or thickening");


        List<String> skin = new ArrayList<String>();

        skin.add("Be smooth and pearly");
        skin.add("Look waxy");
        skin.add("Appear as a firm, red lump or may look sunken in the middle");
        skin.add("Feel itchy and bleed sometimes");
        skin.add("Develop a crust or scab");
        skin.add("Begin to heal but never completely heal");
        skin.add("Look like a flat, red spot that is scaly and crusty");
        skin.add("Look like a pale non-healing scar");
        skin.add("Develop into a painless ulcer.");

        List<String> dengue = new ArrayList<String>();

        dengue.add("Sudden, high fever");


        dengue.add("Severe headaches");
        dengue.add("Pain behind the eyes");
        dengue.add("Severe joint and muscle pain");
        dengue.add("Fatigue");
        dengue.add("Nausea");
        dengue.add("Vomiting");
        dengue.add("Skin rash");

        List<String> ham = new ArrayList<String>();

        ham.add("Increased frequency");
        ham.add("Urgency");
        ham.add("Nocturia");
        ham.add("Incontinence");
        ham.add("Urinary retention ");
        ham.add("Double vision");
        ham.add("Facial paralysis");
        ham.add("Deafness");

        List<String>  diabetes= new ArrayList<String>();

        diabetes.add("Urinating often");
        diabetes.add("Feeling very thirsty.");
        diabetes.add("Feeling very hungry - even though you are eating.");
        diabetes.add("Extreme fatigue.");
        diabetes.add("Blurry vision.");
        diabetes.add("Cuts/bruises that are slow to heal");
        diabetes.add("Weight loss");
        diabetes.add("Tingling, pain, or numbness in the hands/feet");

        List<String>  fever= new ArrayList<String>();

        fever.add("Small, painless nodules under the skin.");
        fever.add("Chest pain");
        fever.add("Rapid fluttering or pounding chest palpitation");
        fever.add("Lethargy or fatigue");
        fever.add("Nosebleeds");
        fever.add("Stomach pain");
        fever.add("Painful or sore joints in the wrists, elbows, knees, and ankles");

        List<String>  alzheimer= new ArrayList<String>();

        alzheimer.add("Memory loss");
        alzheimer.add("Difficulty planning and solving problems");
        alzheimer.add("Difficulty completing familiar tasks");
        alzheimer.add("Difficulty determining time or place");
        alzheimer.add("Vision loss");
        alzheimer.add("Difficulty finding the right words");

        List<String>  asthma= new ArrayList<String>();

        asthma.add("Shortness of breath");
        asthma.add("Chest tightness or pain");
        asthma.add("Trouble sleeping caused by shortness of breath, coughing or wheezing");
        asthma.add("A whistling or wheezing sound when exhaling");
        asthma.add("Coughing or wheezing attacks that are worsened by a respiratory virus, such as a cold or the flu");
        asthma.add("Asthma signs and symptoms that are more frequent and bothersome");
        asthma.add("The need to use a quick-relief inhaler more often");

        List<String>   Migraine= new ArrayList<String>();

        Migraine.add("A headache that often begins as a dull ache and grows into throbbing pain.");
        Migraine.add("Sensitivity to light, noise, and smells.");
        Migraine.add("Nausea and vomiting, upset stomach, and belly pain");
        Migraine.add("Loss of appetite");
        Migraine.add("Feeling very warm or cold");
        Migraine.add("Pale skin");


        List<String>   hiv= new ArrayList<String>();
        hiv.add("Nausea");
        hiv.add("Vomiting");
        hiv.add("Persistent diarrhea");
        hiv.add("Chronic fatigue.");
        hiv.add("Rapid weight loss.");
        hiv.add("Cough and shortness of breath.");
        hiv.add("Recurring fever, chills, and night sweats");

        List<String>   thyroid= new ArrayList<String>();
        thyroid.add("A lump in the neck, sometimes growing quickly");
        thyroid.add("Swelling in the neck");
        thyroid.add("Pain in the front of the neck, sometimes going up to the ears");
        thyroid.add("Hoarseness or other voice changes that do not go away");
        thyroid.add("Trouble swallowing");

        List<String> Arthritis=new ArrayList<String>();

        Arthritis.add("Fatigue");
        Arthritis.add("Joint pain");
        Arthritis.add("Joint tenderness");
        Arthritis.add("Joint swelling");
        Arthritis.add("Joint redness");
        Arthritis.add("Joint warmth");
        Arthritis.add("Joint stiffness");


        expandableListDetail.put("Dengue Fever", dengue);
        expandableListDetail.put("Breast Cancer", breast);
        expandableListDetail.put("Blood Cancer", Blood);
        expandableListDetail.put("Skin Cancer", skin);

        expandableListDetail.put("Ham", ham);
        expandableListDetail.put("Diabetes", diabetes);
        expandableListDetail.put("Rheumatic fever", fever);
        expandableListDetail.put("Alzheimer", alzheimer);
        expandableListDetail.put("Migrane", Migraine);
        expandableListDetail.put("HIV", hiv);
        expandableListDetail.put("Thyroid Cancer", thyroid);
        expandableListDetail.put("Arthritis", Arthritis);
        return expandableListDetail;
    }
}