.class public abstract LF2/g;
.super Ly2/K;
.source "SourceFile"


# instance fields
.field public final f:LF2/b;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 7

    invoke-direct {p0}, Ly2/r;-><init>()V

    new-instance v6, LF2/b;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, LF2/b;-><init>(IIJLjava/lang/String;)V

    iput-object v6, p0, LF2/g;->f:LF2/b;

    return-void
.end method


# virtual methods
.method public final d(Lg2/i;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, LF2/g;->f:LF2/b;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p1, p2, v0, v1}, LF2/b;->c(LF2/b;Ljava/lang/Runnable;ZI)V

    return-void
.end method
