.class final Landroidx/compose/ui/input/key/KeyInputElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:Lo0/r;


# direct methods
.method public constructor <init>(Lo0/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->a:Lo0/r;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 2

    new-instance v0, Lg0/d;

    invoke-direct {v0}, LP/k;-><init>()V

    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->a:Lo0/r;

    iput-object v1, v0, Lg0/d;->q:Lo0/r;

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 1

    check-cast p1, Lg0/d;

    iget-object v0, p0, Landroidx/compose/ui/input/key/KeyInputElement;->a:Lo0/r;

    iput-object v0, p1, Lg0/d;->q:Lo0/r;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/input/key/KeyInputElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/input/key/KeyInputElement;

    iget-object p1, p1, Landroidx/compose/ui/input/key/KeyInputElement;->a:Lo0/r;

    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->a:Lo0/r;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    const/4 p1, 0x0

    invoke-static {p1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/input/key/KeyInputElement;->a:Lo0/r;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KeyInputElement(onKeyEvent="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->a:Lo0/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onPreKeyEvent=null)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
