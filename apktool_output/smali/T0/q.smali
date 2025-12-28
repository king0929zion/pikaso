.class public final Lt0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lo2/e;

.field public c:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 4
    sget-object v0, Lt0/m;->o:Lt0/m;

    .line 5
    invoke-direct {p0, p1, v0}, Lt0/q;-><init>(Ljava/lang/String;Lo2/e;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lo2/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lt0/q;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lt0/q;->b:Lo2/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLo2/e;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p3}, Lt0/q;-><init>(Ljava/lang/String;Lo2/e;)V

    .line 7
    iput-boolean p2, p0, Lt0/q;->c:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AccessibilityKey: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt0/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
