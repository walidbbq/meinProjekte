<?php

class Adresse {
    
private $strasse;
private $hausnr;
private $plz;
private $wohnort;
    
function __construct($strasse, $hausnr, $plz, $wohnort) {
    
    $this->strasse=$strasse;
    $this->hausnr=$hausnr;
    $this->plz=$plz;
    $this->wohnort=$wohnort;
}

function getStrasse(){
    return $this->strasse;
}


function  getHausnr() {
    return $this->hausnr;
}

function getPlz() {
    return $this->plz;
}

function getWohnort() {
    return $this->wohnort;
}

}
?>