# NullTrace
Null HTrace replacement for HBase Client

Have you used the HBase Shaded Client? Have you come across the HTrace dependency that's from 2014 and shaded incorrectly? Do you not care about having HTrace in your dependencies? Do you want to get rid of HTrace from HBase?

You've come to the right place! Right now, for a low low price of free, I bring you NullTrace, a drop-in replacement for the HTrace library that works* with the HBase Shaded Client v2.2.1 and gets rid of the dependency on HTrace.

*works might be a misnomer, I've only tested it in a limited fashion for a limited use case, YMMV.

This is provided as-is. If it breaks your machine, you probably need the real HTrace. Or a dev environment to test your changes before you break production. I dunno how you work. All I know is that this reduces a couple of dependencies in my system.

## What does it do?
Add these classes to your classpath and get rid of the HTrace jar in your dependency tree. If all goes well, this class will return *null* values to HBase, and your system should no longer do any HTrace stuff, and *maybe* gracefully continue doing HBase stuff.

## Looks complex?
Yes, as you can see, thousands of lines of code went into making these *ahem* carefully handcrafted classes. I did not just take a machete to HTrace.
