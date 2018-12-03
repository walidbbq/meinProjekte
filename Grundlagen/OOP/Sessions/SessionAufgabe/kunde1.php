<?php

class kunde1 {
    private $vorname;
    private $nachname;
    private $email;
    
    function getVorname() {
        return $this->vorname;
    }
    
    function setVorname($vorname) {
        $this->vorname=$vorname;
    }
    
    function getNachname(){
        return $this->nachname;
    }
    
    function setNachname ($nachname) {
        $this->nachname=$nachname;
    }
    
    function getEmail() {
        return $this->email;
    }
    
    function setEmail($email) {
        $this->email=$email;
    }
}

?>