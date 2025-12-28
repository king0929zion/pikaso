.class public abstract Li2/h;
.super Li2/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lg2/d;)V
    .locals 1

    invoke-direct {p0, p1}, Li2/a;-><init>(Lg2/d;)V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lg2/d;->o()Lg2/i;

    move-result-object p1

    sget-object v0, Lg2/j;->d:Lg2/j;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final o()Lg2/i;
    .locals 1

    sget-object v0, Lg2/j;->d:Lg2/j;

    return-object v0
.end method
