     for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
         context.exception = e;
     }
     