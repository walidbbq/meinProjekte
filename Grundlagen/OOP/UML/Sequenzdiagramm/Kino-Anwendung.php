<?php

class Kunde {
    private $geldbeutel;
    private $film;
    public function __construct($betrag, $film) {
        $this->geldbeutel = $betrag;
        $this->film = $film;
    }
    public function kaufeKarte($filmtitel) {
        $this->film->filmAuswaehlen($filmtitel);
        $abbuchung = new Abbuchung();
        $abbuchung->abbuchen($this, $this->film);
    }
    public function geldbeutelAbfragen() {
        return $this->geldbeutel;
    }
    public function geldAbbuchen($betrag) {
        $this->geldbeutel -= $betrag;
    }
}
class Film {
    private $titel;
    private $kinosaal;
    private $preis;
    public function filmAuswaehlen($titel) {
//         $this-> titel = $titel;
        switch($titel) {
            case "Django":
               echo $this->name = "Django";
                $this->kinosaal = 1;
                $this->preis = 8.50;
                break;
            case "Die Glorreichen":
                echo $this->name = "Die Glorreichen";
                $this->kinosaal = 2;
                echo $this->preis = 7.50;
                break;
            case "Hängt ihn höher":
                echo $this->name = "Hängt ihn höher";
                echo $this->kinosaal = 3;
                echo $this->preis = 9.20;
                break;
        }
        
    }
    public function getPreis() {
        return $this->preis;
    }
}
class Abbuchung {
    public function abbuchen($kunde, $film) {
        $filmPreis = $film->getPreis();
        $kunde->geldAbbuchen($filmPreis);
    }
}


$k1 = new Kunde(20, new Film());
$k1->kaufeKarte("Hängt ihn höher");



?>