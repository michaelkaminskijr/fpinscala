trait Animal:
  val numberOfLegs: Int

case class Cat(name: String) extends Animal:
  override val numberOfLegs = 4

case class Dog(name: String) extends Animal:
  override val numberOfLegs = 4

def countTheLegs(critters: List[Animal]): Int =
  critters.foldLeft(0)( _ + _.numberOfLegs)

val myPets: List[Cat] = List(new Cat("Piper"), new Cat("Theodore"))

val numberOfPetLegs = countTheLegs(myPets) // Works because List[Cat] is a subtype of List[Animal]