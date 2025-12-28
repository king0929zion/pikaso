.class public abstract Li2/j;
.super Li2/c;
.source "SourceFile"

# interfaces
.implements Lp2/e;


# instance fields
.field public final g:I


# direct methods
.method public constructor <init>(ILg2/d;)V
    .locals 0

    invoke-direct {p0, p2}, Li2/c;-><init>(Lg2/d;)V

    iput p1, p0, Li2/j;->g:I

    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    iget v0, p0, Li2/j;->g:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Li2/a;->d:Lg2/d;

    if-nez v0, :cond_0

    sget-object v0, Lp2/p;->a:Lp2/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lp2/q;->a(Lp2/e;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(...)"

    invoke-static {v0, v1}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Li2/a;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
