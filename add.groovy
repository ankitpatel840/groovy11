import groovy.lang.GroovyClassLoader

def gcl = new GroovyClassLoader()
def clazz = gcl.parseClass('class Foo { void doIt() { println "ok" } }')
assert clazz.name == 'Foo'
def o = clazz.newInstance()
o.doIt()

