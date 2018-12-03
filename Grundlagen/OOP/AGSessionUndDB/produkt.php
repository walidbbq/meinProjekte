<?php

class produkt {
    
    public $pid;
    public $produktname;
    public $beschreibung;
    public $preis;
    
    function __construct($pid,$produktname,$beschreibung,$preis) {
        $this->pid = $pid;
        $this->produktname=$produktname;
        $this->beschreibung=$beschreibung;
        $this->preis= $preis;
        
       
    }
    
    
}




?>