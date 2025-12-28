.class public final LP/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/l;


# instance fields
.field public final a:LP/l;

.field public final b:LP/l;


# direct methods
.method public constructor <init>(LP/l;LP/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP/f;->a:LP/l;

    iput-object p2, p0, LP/f;->b:LP/l;

    return-void
.end method


# virtual methods
.method public final a(Lo2/c;)Z
    .locals 1

    iget-object v0, p0, LP/f;->a:LP/l;

    invoke-interface {v0, p1}, LP/l;->a(Lo2/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LP/f;->b:LP/l;

    invoke-interface {v0, p1}, LP/l;->a(Lo2/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LP/f;->a:LP/l;

    invoke-interface {v0, p1, p2}, LP/l;->b(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LP/f;->b:LP/l;

    invoke-interface {v0, p1, p2}, LP/l;->b(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LP/f;

    if-eqz v0, :cond_0

    check-cast p1, LP/f;

    iget-object v0, p1, LP/f;->a:LP/l;

    iget-object v1, p0, LP/f;->a:LP/l;

    invoke-static {v1, v0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LP/f;->b:LP/l;

    iget-object p1, p1, LP/f;->b:LP/l;

    invoke-static {v0, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, LP/f;->a:LP/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, LP/f;->b:LP/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, LP/e;->e:LP/e;

    const-string v2, ""

    invoke-virtual {p0, v2, v1}, LP/f;->b(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
