.class public final Ln0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/f0;


# instance fields
.field public final d:Ln0/a0;


# direct methods
.method public constructor <init>(Ln0/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/b0;->d:Ln0/a0;

    return-void
.end method


# virtual methods
.method public final w()Z
    .locals 1

    iget-object v0, p0, Ln0/b0;->d:Ln0/a0;

    check-cast v0, LP/k;

    iget-object v0, v0, LP/k;->d:LP/k;

    iget-boolean v0, v0, LP/k;->p:Z

    return v0
.end method
