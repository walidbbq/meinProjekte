<?php
class person {
 
    private $id;
    private $vorname;
    private $nachname;
    private $telefonnummer;
    
 
    
    public function __construct($id, $nachname, $vorname, $telefonnummer) {
        
        $this -> id=$id;
        $this -> vorname = $vorname;
        $this -> nachname = $nachname;
        $this -> telefonnummer=$telefonnummer;
    }
    
    
    public function setID($id) {
        $this->id=$id;
    }
    
    public function getID() {
        return $this-> id;
    }
    
    public function setVorname($vorname) {
        $this -> vorname=$vorname;
    }
    
    public function getVorname(){
        return $this -> vorname;
    }
    
    
    public function setNachname($nachname) {
        $this -> nachname=nachname;
    }
    
    public function getNachname(){
        return $this -> nachname;
    }
    
    public function setTelefonnummer($telefonnummer) {
        $this-> telefonnummer=$telefonnummer;
    }
    
    public function getTelefonnummer() {
        return $this -> telefonnummer;
    }
    
}


    
?>