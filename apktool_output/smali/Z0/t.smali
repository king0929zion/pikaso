.class public final Lz0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/L0;


# instance fields
.field public final d:Ljava/lang/Object;

.field public final e:Z


# direct methods
.method public constructor <init>(Landroid/graphics/Typeface;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/t;->d:Ljava/lang/Object;

    iput-boolean v0, p0, Lz0/t;->e:Z

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz0/t;->d:Ljava/lang/Object;

    return-object v0
.end method
