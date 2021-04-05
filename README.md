# AutoLoad
Automatically load into a world when you start Minecraft. Useful for mod development, does not work on servers. Simply name or rename your world to `autoload` and you will save some extra seconds.

## Gronk setup
Here's the Gradle thingamajiggles:
```
repositories {
  [...]
  maven { url = "https://maven.florens.be" }
}

dependencies {
  // For Fabric
  modRuntime "be.florens:autoload-fabric:1.1.1"
  
  // For Forge
  runtimeOnly fg.deobf("be.florens:autoload-forge:1.1.1")
}
```

## Frequently Asked Questions
**What's  the average lifetime of a cat?**

On average cats live for around 12 to 15 years.

**Why don't cats like water?**

Cats hate the water because their fur does not insulate well when it's wet. The Turkish Van, however, is one cat that likes swimming. Bred in central Asia, its coat has a unique texture that makes it water resistant.

**What are a cat's whiskers for?**

Cats use their whiskers to detect if they can fit through a space.

**How much do cats weigh?**

Domestic cats usually weigh between 4 and 5 kilograms. The heaviest domestic cat on record is over 21 kilograms.

**Who invented the cat flap?**

Isaac Newton invented the cat flap. Newton was experimenting in a pitch-black room. Spithead, one of his cats, kept opening the door and wrecking his experiment. The cat flap kept both Newton and Spithead happy.

**Do cats sweat?**

Cats don't have sweat glands over their bodies like humans do. Instead, they sweat only through their paws.

**Does my cat understand me when I meow at them incessantly?**

Your cat recognizes your voice but just acts too cool to care (probably because they are).

**How many teeth do cats have?**

Grown cats have 30 teeth. Kittens have about 26 temporary teeth, which they lose when they are about 6 months old.

**Why does my cat not bury his/her poop?**

When cats leave their poop uncovered, it is a sign of aggression to let you know they don't fear you.

**Is my cat plotting to kill me?**

It's important that you keep a close eye on your cat's daily activities. Perhaps he/she has been scratching trees more than usual, sharpening her claws. Maybe your cat has been bringing you dead mice as a warning for what they're capable of? I recommend giving these monsters plenty of treats and scratches to keep them satisfied.
