public boolean squirrelPlay(int temperature, boolean isSummer) {
    int upperLimit = isSummer ? 100 : 90;
    return temperature >= 60 && temperature <= upperLimit;
}

