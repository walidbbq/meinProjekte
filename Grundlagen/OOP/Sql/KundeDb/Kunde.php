<?php

class kundedb {
    
    public $kid;
    public $vorname;
    public $nachname;
    public $email;
    
    function __construct($kid,$vorname,$nachname,$email) {
        $this->kid=$kid;
        $this->vorname=$vorname;
        $this->nachname=$nachname;
        $this->email=$email;
    }
}


?>


