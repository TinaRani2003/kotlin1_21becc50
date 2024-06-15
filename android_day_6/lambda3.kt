fun createAdder(numberToAdd: Int): (Int) -> Int {
    return { input: Int -> input + numberToAdd }
}
