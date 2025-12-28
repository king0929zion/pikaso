.class public abstract Ly2/r;
.super Lg2/a;
.source "SourceFile"

# interfaces
.implements Lg2/f;


# static fields
.field public static final e:Ly2/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly2/q;

    sget-object v1, Lg2/e;->d:Lg2/e;

    sget-object v2, Ly2/p;->e:Ly2/p;

    invoke-direct {v0, v1, v2}, Ly2/q;-><init>(Lg2/h;Lo2/c;)V

    sput-object v0, Ly2/r;->e:Ly2/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lg2/e;->d:Lg2/e;

    invoke-direct {p0, v0}, Lg2/a;-><init>(Lg2/h;)V

    return-void
.end method


# virtual methods
.method public abstract d(Lg2/i;Ljava/lang/Runnable;)V
.end method

.method public final e(Lg2/h;)Lg2/i;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ly2/q;

    sget-object v1, Lg2/j;->d:Lg2/j;

    if-eqz v0, :cond_2

    check-cast p1, Ly2/q;

    iget-object v0, p0, Lg2/a;->d:Lg2/h;

    if-eq v0, p1, :cond_0

    iget-object v2, p1, Ly2/q;->e:Lg2/h;

    if-ne v2, v0, :cond_1

    :cond_0
    iget-object p1, p1, Ly2/q;->d:Lp2/h;

    invoke-interface {p1, p0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg2/g;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, p0

    goto :goto_0

    :cond_2
    sget-object v0, Lg2/e;->d:Lg2/e;

    if-ne v0, p1, :cond_1

    :goto_0
    return-object v1
.end method

.method public g()Z
    .locals 1

    instance-of v0, p0, Ly2/m0;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final n(Lg2/h;)Lg2/g;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ly2/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Ly2/q;

    iget-object v0, p0, Lg2/a;->d:Lg2/h;

    if-eq v0, p1, :cond_0

    iget-object v2, p1, Ly2/q;->e:Lg2/h;

    if-ne v2, v0, :cond_2

    :cond_0
    iget-object p1, p1, Ly2/q;->d:Lp2/h;

    invoke-interface {p1, p0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg2/g;

    if-eqz p1, :cond_2

    move-object v1, p1

    goto :goto_0

    :cond_1
    sget-object v0, Lg2/e;->d:Lg2/e;

    if-ne v0, p1, :cond_2

    move-object v1, p0

    :cond_2
    :goto_0
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ly2/v;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
