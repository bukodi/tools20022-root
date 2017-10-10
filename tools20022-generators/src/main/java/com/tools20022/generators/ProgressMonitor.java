package com.tools20022.generators;

public class ProgressMonitor {
	// Currently this is only a skeleton implementation
	
	boolean isCompleted = false;
	private final ProgressMonitor parentMonitor;
	
	public ProgressMonitor() {
		this(null);
	}

	public ProgressMonitor(ProgressMonitor parentMonitor) {
		this.parentMonitor = parentMonitor;
	}
	
	public ProgressMonitor subTask() {
		return new ProgressMonitor(this);
	}
	
	public void info( String msg ) {
		//System.out.println( msg );
	}

	public void error( String msg, Throwable thw  ) {
		System.err.println( msg );
		thw.printStackTrace(System.err);
	}
	
	public void complete() {
		isCompleted = true;
	}
	
}
