package com.tools20022.generators;

public class ProgressMonitor {
	// Currently this is only a skeleton implementation
	
	private final long baseMemUsage;
	private final long startedAt;
	private final String tab; 

	boolean isCompleted = false;
	private final ProgressMonitor parentMonitor;
	
	public ProgressMonitor() {
		this( null, "" );
	}

	protected ProgressMonitor(ProgressMonitor parentMonitor, String tab ) {
		this.parentMonitor = parentMonitor;
		this.tab = tab;
		baseMemUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		startedAt = System.currentTimeMillis();
	}
	
	public ProgressMonitor subTask() {
		return new ProgressMonitor(this, this.tab + ">>");
	}
	
	public void trace( String msg ) {
		//System.out.println( tab + " " + msg );
	}

	public void info( String msg ) {
		System.out.println( tab + " " + msg );
	}

	public void error( String msg, Throwable thw  ) {
		System.err.println( tab + " " + msg );
		thw.printStackTrace(System.err);
	}
	
	public void complete() {
		isCompleted = true;
	}
	
}
