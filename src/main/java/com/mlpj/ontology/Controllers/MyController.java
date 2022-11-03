package com.mlpj.ontology.Controllers;

import com.mlpj.ontology.JenaWork.InitJena;
import net.minidev.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @CrossOrigin
    @RequestMapping("/getRef")
    public List<JSONObject> getRef() {

        String queryString = "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +

                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                "SELECT ?X WHERE { ?X rdf:type ns:Ref .}";


        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }


    @CrossOrigin
    @RequestMapping("/getCommentator")
    public List<JSONObject> getCommentator() {

        String queryString = "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +

                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                "SELECT ?X WHERE { ?X rdf:type ns:commentator .}";


        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getJournalist")
    public List<JSONObject> getJournalist() {

        String queryString = "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +

                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                "SELECT ?X WHERE { ?X rdf:type ns:Journalist .}";

        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getCoach")
    public List<JSONObject> getCoach() {

        String queryString = "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +

                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                "SELECT ?X WHERE { ?X rdf:type ns:Coach .}";

        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }


    @CrossOrigin
    @RequestMapping("/getFans")
    public List<JSONObject> getSpectateur() {

        String queryString = "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +

                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                "SELECT ?X WHERE { ?X rdf:type ns:Fans .}";

        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getAthlete")
    public List<JSONObject> getAthlete() {

        String queryString =
                "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
                        "SELECT ?X WHERE { ?Y rdfs:subClassOf* ns:Athlete ." +
                        "?X rdf:type ?Y}";
        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }


    @CrossOrigin
    @RequestMapping("/getGame")
    public List<JSONObject> getPartie() {

        String queryString = "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                "SELECT ?X WHERE { ?X rdf:type ns:Game .}";


        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }
    @CrossOrigin
    @RequestMapping("/getCourt")
    public List<JSONObject> getCourt() {

        String queryString = "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                "SELECT ?X WHERE { ?X rdf:type ns:Court .}";


        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getAllPersonn")
    public List<JSONObject> getAllPersonn() {

        String queryString =
                "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
                        "SELECT ?X WHERE { ?Y rdfs:subClassOf* ns:Personn ." +
                        "?X rdf:type ?Y}";
        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getAllCompetition")
    public List<JSONObject> getAllCompetition() {

        String queryString =
                "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
                        "SELECT ?X WHERE { ?Y rdfs:subClassOf* ns:Competition ." +
                        "?X rdf:type ?Y}";
        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getAllEquipe")
    public List<JSONObject> getAllEquipe() {

        String queryString =
                "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
                        "SELECT ?X WHERE { ?Y rdfs:subClassOf* ns:Equipe ." +
                        "?X rdf:type ?Y}";
        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/describePartie")
    public List<JSONObject> describePartie() {

        String queryString =
                "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
                        "SELECT ?Y WHERE { ?Y rdfs:subClassOf* ns:Personn ." +
                        "?X rdfs:SubPropertyOF ns:joueAvec}";
        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getAllObjectPrpoerty")
    public List<JSONObject> getObjectPrpoerty() {

        String queryString = "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                "PREFIX owl: <http://www.test123.com/test123-ontology.owl#>" +
                "PREFIX oo:  <http://www.w3.org/2002/07/owl#>" +
                "SELECT ?X  WHERE { ?X rdf:type oo:ObjectProperty ."
                + " }";


        List<JSONObject> resultSet = InitJena.getItemPropety(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getAllDataPrpoerty")
    public List<JSONObject> getDataPrpoerty() {

        String queryString = "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                "PREFIX owl: <http://www.test123.com/test123-ontology.owl#>" +
                "PREFIX oo:  <http://www.w3.org/2002/07/owl#>" +
                "SELECT ?X  WHERE { ?X rdf:type oo:DataTypeProperty ."
                + " }";


        List<JSONObject> resultSet = InitJena.getItemPropety(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }


    @CrossOrigin
    @RequestMapping("/getspecificpartie")
    public List<JSONObject> getspecificpartie() {

        String queryString =
                "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                        "PREFIX owl: <http://www.test123.com/test123-ontology.owl#>" +
                        "PREFIX oo:  <http://www.w3.org/2002/07/owl#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
                        "SELECT ?Z WHERE {ns:Game oo:DatatypeProperty ?Z ." +

                        "}";
        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        return resultSet;
    }


    @CrossOrigin
    @RequestMapping("/getTV")
    public List<JSONObject> getTelevision() {

        String queryString = "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +

                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                "SELECT ?X WHERE { ?X rdf:type ns:TV .}";

        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getStreaming")
    public List<JSONObject> getwebsite() {

        String queryString =
                "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
                        "SELECT ?X WHERE { ?X rdf:type ns:Streaming .}";
        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getMedia")
    public List<JSONObject> getMedia() {

        String queryString =
                "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
                        "SELECT ?X WHERE { ?Y rdfs:subClassOf* ns:Media ." +
                        "?X rdf:type ?Y}";
        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getNBA")
    public List<JSONObject> getInternationale() {

        String queryString =
                "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
                        "SELECT ?X WHERE { ?X rdf:type ns:NBA .}";
        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }

    @CrossOrigin
    @RequestMapping("/getEuroligue")
    public List<JSONObject> getNationale() {

        String queryString =
                "PREFIX ns: <http://www.semanticweb.org/amirm/ontologies/2022/9/Basket#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
                        "SELECT ?X WHERE { ?X rdf:type ns:Euroligue .}";
        List<JSONObject> resultSet = InitJena.getItems(queryString);
        System.out.println(queryString);
        System.out.println(resultSet);
        return resultSet;
    }
}
