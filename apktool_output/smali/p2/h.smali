.class public abstract Lp2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp2/e;
.implements Ljava/io/Serializable;


# instance fields
.field public final d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp2/h;->d:I

    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    iget v0, p0, Lp2/h;->d:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lp2/p;->a:Lp2/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lp2/q;->a(Lp2/e;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(...)"

    invoke-static {v0, v1}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
