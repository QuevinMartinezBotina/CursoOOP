<?php
class UberPool extends Car
{
    public $typeCar;
    public $seatsMaterial;


    public function __construct($license, $driver, $typeCar, $seatsMaterial)
    {
        parent::__construct($license, $driver);
        $this->typeCar = $typeCar;
        $this->seatsMaterial = $seatsMaterial;
    }
}
